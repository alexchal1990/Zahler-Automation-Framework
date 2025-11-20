Zahler Automated Testing Framework (Java + Selenium + TestNG)

This repository contains a complete UI automation framework built for validating core user flows in the Zahler bookkeeping application.
It demonstrates real-world test automation skills using Selenium WebDriver, Java, TestNG, and the Page Object Model (POM) design pattern.

This framework was created as part of real QA automation work and is structured to reflect industry best practices.

📚 Table of Contents

Introduction

Framework Features

Technologies Used

Project Structure

Test Execution

Test Suites

Configuration

Notes

📌 1. Introduction

The purpose of this project is to automate the most important end-to-end scenarios of the Zahler bookkeeping web application:

Login & Logout

User Registration

Forgot Password flow

Creating bookkeeping transactions

The test suite uses TestNG, POM, and a centralized Base Test class for cleaner, maintainable, and scalable test automation.

🔥 2. Framework Features

✔ Selenium WebDriver automation

✔ TestNG for test management & reports

✔ Page Object Model (POM) structure

✔ Reusable BaseT class for setup/teardown

✔ Config-driven credentials

✔ Regression suite included

✔ Clean package separation for clarity

🛠 3. Technologies Used
Component	Technology
Language	Java 17+
Automation	Selenium WebDriver
Test Framework	TestNG
Build Tool	Maven
Browser	Chrome
Pattern	Page Object Model
📂 4. Project Structure (matches your real folder layout)
src/
 ├── Base/
 │     └── BaseT.java                → WebDriver setup, teardown, config load
 │
 ├── PageObject/                     → Page Object Model
 │     ├── LoginPage.java
 │     ├── RegisterPage.java
 │     ├── ForgotPasswordPage.java
 │     └── CreateTransactionPage.java
 │
 ├── Test.User_TC/                   → User flow test cases
 │     ├── Login_LogOut.java
 │     └── Register_New_User.java
 │
 ├── Test.Forgot_Pass_TC/            → Password reset tests
 │     └── Forgot_password.java
 │
 ├── Functional_TC/                  → Financial transaction flow
 │     └── Create_Transaction.java
 │
 └── main.resources.config/          → Configuration utilities
       ├── ConfigReader.java
       └── config.properties         → Test data (safe, fake credentials)

▶️ 5. How to Run the Tests
Run regression suite using TestNG:

Right-click Regression.xml

Choose Run As → TestNG Suite

Run tests with Maven:
mvn clean test -Dsuite=Regression.xml

Run a single test:

Right-click the test class →
Run As → TestNG Test

🧪 6. Test Suites
✔ Regression.xml

Includes:

Login / Logout

Registration

Forgot Password

Create Transaction

This suite tests all major flows of the application.

⚙️ 7. Configuration

The framework reads values from:

main.resources.config/config.properties


Example:

baseUrl=https://zahler-test.randomolo.co.uk
email=test.user@example.com
password=Password123!


✔ Only fake test accounts
✔ No sensitive credentials
✔ Safe for public GitHub repositories

📝 8. Notes

This project was built as part of real QA automation work.

Credentials included are NOT production data.

The project demonstrates junior-to-mid level automation skills used in modern software teams.
