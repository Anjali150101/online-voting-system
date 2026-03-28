# 🗳️ Online Voting System

## 📌 Project Overview

The Online Voting System is a full-stack web application developed using Java Servlets, JDBC, and MySQL. It allows users to securely cast their votes while ensuring that each user can vote only once. The system also provides an admin panel to manage candidates and view voting results.

---

## 🚀 Features

### 👤 User Module

* User Registration & Login
* Secure Authentication
* One User → One Vote
* View Candidates
* Cast Vote

### 🛠️ Admin Module

* Admin Login
* Add Candidates
* View Results
* Manage Elections

### 📊 System Features

* Real-time vote counting
* Secure database operations
* Session management
* Prevent multiple voting

---

## 🧰 Technologies Used

* **Frontend:** HTML, CSS, JavaScript
* **Backend:** Java (Servlets, JDBC)
* **Database:** MySQL
* **Server:** Apache Tomcat
* **IDE:** Eclipse

---

## 🗂️ Project Structure

```
online-voting-system
│
├── src/
│   └── com.voting
│       ├── controller
│       ├── dao
│       ├── model
│       └── util
│
├── WebContent/
│   ├── css/
│   ├── js/
│   ├── index.html
│   ├── login.html
│   ├── register.html
│   ├── dashboard.html
│   ├── admin.html
│   └── results.html
│
└── database.sql
```

---

## ⚙️ Setup Instructions

1. Clone the repository:

```
git clone https://github.com/your-username/online-voting-system.git
```

2. Import project into Eclipse as **Dynamic Web Project**

3. Configure Apache Tomcat server

4. Setup MySQL Database:

   * Create database: `online_voting_system`
   * Run `database.sql`

5. Update DB credentials in:

```
DBConnection.java
```

6. Run project on server:

```
http://localhost:8080/online-voting-system/
```

---

## 🧪 Testing Flow

1. Register a new user
2. Login as user
3. Admin adds candidates
4. User casts vote
5. View results

---

## 🔐 Security Features

* Password validation
* One-time voting restriction
* Session management
* SQL injection prevention using PreparedStatement

---

## 📈 Future Enhancements

* Email verification
* OTP-based authentication
* Blockchain-based voting
* Graphical analytics for results

---

## 📢 Conclusion

This project demonstrates a secure and efficient voting system that minimizes manual effort and enhances transparency using modern web technologies.

---
