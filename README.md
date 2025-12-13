# Scalable Inventory Management Backend

## 🚀 Tech Stack

* **Language:** Java 17
* **Framework:** Spring Boot 3
* **Security:** Spring Security, JWT (Stateless Authentication)
* **Database:** MySQL, Spring Data JPA
* **Build Tool:** Maven
* **Architecture:** Layered (Controller → Service → Repository)

---

## ✨ Key Features

* Secure **RESTful APIs** for inventory management
* **JWT-based authentication** (stateless & scalable)
* Pagination and request validation
* Global exception handling with meaningful error responses
* Clean separation of concerns (LLD-friendly)
* Designed with **scalability and microservices readiness** in mind

---

## 📐 System Design Highlights

* Stateless backend services enabling horizontal scaling
* Centralized security and exception handling
* Database schema optimized with indexing considerations
* Easily extendable to microservices architecture

---

## 📂 Project Structure

src/main/java/com/azhar/inventory
│
├── config          # Security configuration (JWT, filters)
├── controller      # REST API controllers
├── service         # Business logic layer
├── repository      # Data access layer (JPA)
├── model           # Entity definitions
├── exception       # Global & custom exceptions
├── security        # JWT token provider & filters
└── InventoryApplication.java

## 🔐 Authentication Flow (JWT)

1. Client authenticates and receives JWT token
2. Token sent in `Authorization: Bearer <token>` header
3. JWT filter validates token for every request
4. Stateless authentication ensures scalability

---

## 🧪 Sample API Endpoints

| Method | Endpoint          | Description                 |
| ------ | ----------------- | --------------------------- |
| POST   | `/api/items`      | Create a new inventory item |
| GET    | `/api/items`      | Get paginated list of items |
| GET    | `/api/items/{id}` | Fetch item by ID            |
| PUT    | `/api/items/{id}` | Update item                 |
| DELETE | `/api/items/{id}` | Delete item                 |

---

## ⚙️ Setup & Run Locally

### Prerequisites

* Java 17+
* Maven
* MySQL

### Steps

```bash
git clone https://github.com/azhardev77/scalable-inventory-management-backend.git
cd scalable-inventory-management-backend
mvn spring-boot:run
```

Configure database in `application.yml` before running.

---

This project demonstrates:

* Backend API design
* Secure authentication (JWT)
* System design thinking (LLD/HLD)
* Clean, maintainable, production-quality code

Common interview topics covered:

* REST API design
* Authentication vs Authorization
* Pagination & performance
* Exception handling
* Scalability considerations

---

## 📌 Future Enhancements

* Role-based access control (RBAC)
* Docker & containerized deployment
* Caching with Redis
* CI/CD pipeline
* API documentation with OpenAPI (Swagger)

---

## 👤 Author

**Mohd Azhar Mansoori**
Backend Software Engineer (Java | Spring Boot)

🔗 GitHub: [https://github.com/azhardev77](https://github.com/azhardev77)
