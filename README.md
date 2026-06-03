# 🍽️ Restaurant Management System (Full Stack)

## 📌 Overview

This project is a full-stack Restaurant Management System designed to handle core functionalities such as user interaction, menu browsing, and order management.

The application is built with a separation of frontend and backend, following a modular and scalable structure.

---

## 🚀 Features

* User interface for browsing menu items
* Login and user interaction components
* Order management functionality
* Responsive UI design
* Modular frontend architecture
* Backend integration for data handling

---

## 🏗️ Project Structure

```
Restaurant-app/
 ├── frontend/        # React application
 └── backend/         # Backend (Java / Spring / Eclipse project)
```

---

## ⚙️ Tech Stack

### Frontend:

* React
* JavaScript
* HTML, CSS

### Backend:

* Java (Eclipse)
* REST APIs

### Tools:

* Git, GitHub
* VS Code, Eclipse

---

## 🔄 System Flow

1. User accesses frontend UI
2. Interacts with menu and features
3. Requests are sent to backend APIs
4. Backend processes data
5. Response is returned and displayed

---

## 📦 Installation & Setup

### Frontend

```bash
cd frontend
npm install
npm start
```

---

### Backend

* Open project in Eclipse
* Run as Java Application / Server
* Ensure backend runs on required port

---

## 🧪 Features Implemented

* Navigation components
* Menu display
* User interface components
* Order handling modules

---

## ⚠️ Limitations

* Basic backend implementation
* No authentication security (for demo)
* Limited database integration

---

## 🔮 Future Enhancements

* Add authentication (JWT)
* Database integration (MySQL / MongoDB)
* Admin dashboard
* Payment integration
* Deployment setup

---

## 📌 Conclusion

This project demonstrates full-stack development skills including frontend UI design and backend integration. It serves as a foundation for building scalable restaurant management applications.

---

## 👨‍💻 Author

Katru Lahari Navya Tejaswi

# 🍽️ Restaurant Management System

A modern full-stack web application for managing restaurant operations — including menu management, order processing, and customer interaction. Built with a focus on improving restaurant workflows and user experience.

---

## 🚀 Features

- User-friendly menu browsing and management
- Order placement and tracking
- Customer interaction support
- Admin dashboard for restaurant staff
- Efficient data handling and storage
- Responsive design for all devices

---

## 🏗️ Architecture

```
┌─────────────────────────────┐
│       React Frontend         │
│  (Menu UI + Order Panel)    │
└─────────────┬───────────────┘
              │ REST API
              ▼
┌─────────────────────────────┐
│     Backend API Server       │
│  (Spring Boot / Node.js)    │
└─────────────┬───────────────┘
              │
              ▼
┌─────────────────────────────┐
│          MySQL DB            │
│  (Menu, Orders, Customers)  │
└─────────────────────────────┘
```

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Frontend | React.js / JavaScript |
| Backend | Spring Boot / Node.js |
| Database | MySQL |
| API Style | REST / JSON |
| Styling | CSS / HTML |
| Version Control | Git |

---

## 📁 Project Structure

```
restaurant-management/
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   │   ├── Menu.js
│   │   │   ├── OrderForm.js
│   │   │   ├── OrderList.js
│   │   │   └── AdminPanel.js
│   │   ├── App.js
│   │   └── index.js
│   └── package.json
├── backend/
│   ├── src/main/java/
│   │   └── com/restaurant/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── repository/
│   │       └── model/
│   └── pom.xml
└── README.md
```

---

## 📌 API Endpoints

### Menu
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/menu` | Get all menu items |
| POST | `/api/menu` | Add new menu item |
| PUT | `/api/menu/{id}` | Update menu item |
| DELETE | `/api/menu/{id}` | Delete menu item |

### Orders
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/orders` | Place a new order |
| GET | `/api/orders` | Get all orders |
| GET | `/api/orders/{id}` | Get order by ID |
| PUT | `/api/orders/{id}/status` | Update order status |

### Customers
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/customers` | Register customer |
| GET | `/api/customers/{id}` | Get customer details |

---

## ⚙️ Getting Started

### Prerequisites
- Java 17+ / Node.js 16+
- MySQL 8.0+
- Maven 3.6+

### Installation

1. **Clone the repository**
```bash
git clone https://github.com/Laharikatru/restaurant-management.git
cd restaurant-management
```

2. **Set up the database**
```sql
CREATE DATABASE restaurant_db;
```

3. **Configure backend** — update `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/restaurant_db
spring.datasource.username=root
spring.datasource.password=your_password
```

4. **Run the backend**
```bash
cd backend
mvn spring-boot:run
```

5. **Run the frontend**
```bash
cd frontend
npm install
npm start
```

6. Open `http://localhost:3000` in your browser.

---

## 🧠 Key Concepts Demonstrated

- **Full Stack Development** — React frontend + Spring Boot backend
- **CRUD Operations** — complete create, read, update, delete for menu and orders
- **REST API Design** — structured endpoints with proper HTTP methods
- **MySQL Integration** — relational data for menu, orders, and customers
- **Real-world Use Case** — solving actual restaurant operational problems
- **Responsive UI** — mobile-friendly interface design

---

## 👩‍💻 Author

**Katru Lahari Navya Tejaswi**  
Java Backend Developer | CDAC PGDAC Graduate  
📧 klaharinavya@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/lahari-navya-ba7361216)  
🐙 [GitHub](https://github.com/Laharikatru)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
