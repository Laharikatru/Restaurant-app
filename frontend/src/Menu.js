import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

function Menu({ search, cart, setCart }) {
  const [items, setItems] = useState([]);

  const { id } = useParams();   // 🔥 get category id

  useEffect(() => {
    if (id) {
      fetch(`http://localhost:9999/menu/category/${id}`)
        .then(res => res.json())
        .then(data => setItems(data));
    } else {
      fetch("http://localhost:9999/menu")
        .then(res => res.json())
        .then(data => setItems(data));
    }
  }, [id]);

  const filtered = items.filter(item =>
    item.itemName.toLowerCase().includes(search.toLowerCase())
  );

  const addToCart = (item) => {
    setCart(prev => [...prev, { ...item, qty: 1 }]);
  };

  return (
    <div className="section">

      <h2 className="section-title">Menu 🍕</h2>

      {filtered.length === 0 ? (
        <p>No items found</p>
      ) : (
        <div className="card-container">

          {filtered.map(item => (
            <div className="card" key={item.id}>

<img src={item.imageUrl} alt={item.itemName} />
              <div className="card-content">
                <h3>{item.itemName}</h3>

                <p style={{ color: "#ff4d4d", fontWeight: "bold" }}>
                  ₹{item.price}
                </p>

                <button onClick={() => addToCart(item)}>
                  Add to Cart
                </button>
              </div>

            </div>
          ))}

        </div>
      )}

    </div>
  );
}

export default Menu;