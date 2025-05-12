A desktop-based Pharmacy Management System developed using Java (NetBeans IDE) with a user-friendly interface built using JFrames (Swing) and backed by MySQL for data storage.

📌 Features

✅ Admin Login System

✅ Add, Update, and Delete Medicines

✅ Search Medicines by Name or ID

✅ Billing System (generate total cost, auto-calculate)

✅ Customer Details Entry

📋 GUI built using Swing / JFrames

🗄️ MySQL Command-Line Client used for database management

🧱 Tech Stack
Layer	Tech Used
Language	Java (JDK)
IDE	NetBeans
GUI	Swing, JFrames
Database	MySQL (Command Line)
JDBC	Java Database Connectivity (JDBC)

📁 Project Structure

pharmacy-management/
├── src/
│   ├── LoginFrame.java
│   ├── DashboardFrame.java
│   ├── AddMedicineFrame.java
│   ├── BillingFrame.java
│   └── ...
├── database/
│   └── pharmacy.sql       # SQL file to set up DB
├── README.md
└── .classpath / .project  # NetBeans config files

⚙️ How to Run the Project
1. Clone or Download the Repository
git clone https://github.com/your-username/pharmacy-management.git
2. Import into NetBeans
Open NetBeans

Go to File > Open Project

Select the folder containing the .nbproject

3. Set Up MySQL Database
Open MySQL Command Line Client

Create database and tables using provided SQL:

SOURCE path/to/pharmacy.sql;
Update database connection credentials in your Java files if needed (host, user, password)

4. Run the Project
Press F6 in NetBeans or click Run


✅ Status
This is a working project with core features. Enhancements like user roles, report generation, and email notifications are planned.

🙌 Contributions
Pull requests are welcome! Feel free to fork, improve UI, or expand database features.

