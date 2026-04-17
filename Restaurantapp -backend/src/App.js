import { BrowserRouter as Router, Routes, Route, Navigate } from "react-router-dom";
import Navbar from "./Navbar";
import Login from "./Login";
import Home from "./Home";
import Category from "./Category";
import Menu from "./Menu";
import Order from "./Order";
import { useState } from "react";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(true);
  const [search, setSearch] = useState("");
  const [cart, setCart] = useState([]);

  return (
    <Router>

      {isLoggedIn && (
        <Navbar 
          setIsLoggedIn={setIsLoggedIn} 
          setSearch={setSearch} 
          cart={cart} 
        />
      )}

      <Routes>

        <Route path="/" element={<Login setIsLoggedIn={setIsLoggedIn} />} />

        <Route path="/home" element={
          isLoggedIn ? <Home /> : <Navigate to="/" />
        } />

        <Route path="/category" element={
          isLoggedIn ? <Category /> : <Navigate to="/" />
        } />

        {/* 🔥 UPDATED */}
        <Route path="/menu" element={
          isLoggedIn ? <Menu search={search} cart={cart} setCart={setCart} /> : <Navigate to="/" />
        } />

        <Route path="/menu/category/:id" element={
          isLoggedIn ? <Menu search={search} cart={cart} setCart={setCart} /> : <Navigate to="/" />
        } />

        <Route path="/order" element={
          isLoggedIn ? <Order cart={cart} setCart={setCart} /> : <Navigate to="/" />
        } />

      </Routes>

    </Router>
  );
}

export default App;