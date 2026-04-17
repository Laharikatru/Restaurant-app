import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

function Navbar({ setIsLoggedIn, setSearch, cart }) {
  const navigate = useNavigate();
  const [input, setInput] = useState("");

  const handleSearch = () => {
    setSearch(input);
    navigate("/menu");
  };

  return (
    <div className="navbar">

      {/* LEFT */}
      <div className="nav-left">
        <h2 onClick={() => navigate("/home")}>FoodNest 🍽️</h2>
      </div>

      {/* CENTER SEARCH */}
      <div className="nav-center">
        <input
          placeholder="Search food..."
          value={input}
          onChange={(e) => setInput(e.target.value)}
        />
        <button onClick={handleSearch}>Search</button>
      </div>

      {/* RIGHT */}
      <div className="nav-right">
        <span onClick={() => navigate("/category")}>Category</span>
        <span onClick={() => navigate("/menu")}>Menu</span>

        <span onClick={() => navigate("/order")}>
          Cart 🛒 ({cart?.length || 0})
        </span>

        <span onClick={() => setIsLoggedIn(false)}>Logout</span>
      </div>

    </div>
  );
}

export default Navbar;