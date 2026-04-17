import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

function Category() {
  const [categories, setCategories] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    fetch("http://localhost:9999/category")
      .then(res => res.json())
      .then(data => setCategories(data));
  }, []);

  return (
    <div className="section">

      <h2 className="section-title">Explore Categories 🍽️</h2>

      <div className="category-grid">

        {categories.map(c => (
          <div
            className="category-card"
            key={c.id}
            onClick={() => navigate(`/menu/category/${c.id}`)}  // 🔥 UPDATED
          >
            <img src={c.imageUrl} alt={c.name} />
            <h3>{c.name}</h3>
          </div>
        ))}

      </div>

    </div>
  );
}

export default Category;