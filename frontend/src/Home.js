import React from "react";
import Slideshow from "./Slideshow";

function Home() {
  return (
    <div>

      {/* 🔥 HERO SECTION */}
      <Slideshow />

      {/* 🔥 BELOW CONTENT */}
      <div className="section">
        <h2 className="section-title">Discover Delicious Food 🍔</h2>
        <p>Order from best restaurants near you</p>
      </div>

    </div>
  );
}

export default Home;