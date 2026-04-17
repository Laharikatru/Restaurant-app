import React, { useState, useEffect } from "react";

function Slideshow() {
  const slides = [
    {
      img: "https://picsum.photos/1200/400?food",
      text: "Discover the best food 🍔"
    },
    {
      img: "https://picsum.photos/1200/400?restaurant",
      text: "Order from top restaurants 🍕"
    },
    {
      img: "https://picsum.photos/1200/400?pizza",
      text: "Fast delivery at your door 🚀"
    }
  ];

  const [index, setIndex] = useState(0);

  useEffect(() => {
    const interval = setInterval(() => {
      setIndex(prev => (prev + 1) % slides.length);
    }, 3000);

    return () => clearInterval(interval);
  }, []);

  return (
    <div style={{ position: "relative" }}>

      {/* Image */}
      <img
        src={slides[index].img}
        alt=""
        style={{
          width: "100%",
          height: "400px",
          objectFit: "cover",
          filter: "brightness(60%)"
        }}
      />

      {/* Overlay Content */}
      <div style={{
        position: "absolute",
        top: "50%",
        left: "50%",
        transform: "translate(-50%, -50%)",
        color: "white",
        textAlign: "center"
      }}>
        <h1 style={{
          fontSize: "40px",
          marginBottom: "10px"
        }}>
          {slides[index].text}
        </h1>

        <p style={{ fontSize: "18px" }}>
          Order food from best restaurants near you
        </p>
      </div>

    </div>
    

  );
}

export default Slideshow;