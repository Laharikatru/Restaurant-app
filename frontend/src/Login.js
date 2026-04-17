import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./Styles.css";



function Login({ setIsLoggedIn }) {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  const navigate = useNavigate();

  const handleLogin = async () => {
    const res = await fetch("http://localhost:9999/api/users/login", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify({ username, password })
    });

    if (res.status === 200) {
      setIsLoggedIn(true);
      navigate("/home");
    } else {
      alert("Invalid credentials");
    }
  };

  return (
  <div className="login-container">
    <div className="login-box">

      <h2 className="login-title">FoodNest</h2>
      <p className="login-sub">Welcome back 👋</p>

      <form onSubmit={(e) => { e.preventDefault(); handleLogin(); }}>
        
        <input
          type="text"
          placeholder="Username"
          value={username}
          onChange={(e) => setUsername(e.target.value)}
        />

        <input
          type="password"
          placeholder="Password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />

        <button type="submit">Login</button>

      </form>

    </div>
  </div>
);
}

export default Login;