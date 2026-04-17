import React from "react";

function Order({ cart, setCart }) {

  // increase qty
  const increase = (id) => {
    const updated = cart.map(item =>
      item.id === id ? { ...item, qty: item.qty + 1 } : item
    );
    setCart(updated);
  };

  // decrease qty
  const decrease = (id) => {
    const updated = cart.map(item =>
      item.id === id && item.qty > 1
        ? { ...item, qty: item.qty - 1 }
        : item
    );
    setCart(updated);
  };

  // remove item
  const remove = (id) => {
    const updated = cart.filter(item => item.id !== id);
    setCart(updated);
  };

  // total
  const total = cart.reduce((sum, item) => sum + item.price * item.qty, 0);

  return (
    <div className="section">

      <h2 className="section-title">Your Order 🛒</h2>

      {cart.length === 0 ? (
        <p>No items in cart</p>
      ) : (
        <div className="order-container">

          {cart.map(item => (
            <div className="order-card" key={item.id}>

              {/* IMAGE */}
              <img src={item.imageUrl} alt={item.itemName} />

              {/* DETAILS */}
              <div className="order-details">
                <h3>{item.itemName}</h3>
                <p>₹{item.price}</p>

                {/* CONTROLS */}
                <div className="order-controls">

                  <button onClick={() => decrease(item.id)}>-</button>

                  <span>{item.qty}</span>

                  <button onClick={() => increase(item.id)}>+</button>

                  <button 
                    className="remove-btn"
                    onClick={() => remove(item.id)}
                  >
                    Remove
                  </button>

                </div>

              </div>

            </div>
          ))}

          {/* TOTAL */}
          <h3 style={{ marginTop: "20px" }}>
            Total: ₹{total}
          </h3>

          {/* PLACE ORDER */}
          <button className="order-btn">
            Place Order
          </button>

        </div>
      )}

    </div>
  );
}

export default Order;