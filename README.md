# Zahler Automated Testing Framework

### Java + Selenium WebDriver + TestNG \| Page Object Model (POM)

![Java](https://img.shields.io/badge/Java-17-orange)
![Selenium](https://img.shields.io/badge/Selenium-4.21.0-brightgreen)
![TestNG](https://img.shields.io/badge/TestNG-7.10-blue)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-red)
![Platform](https://img.shields.io/badge/OS-Windows%20%7C%20macOS%20%7C%20Linux-blue)
![Status](https://img.shields.io/badge/Project-Active-success)

This automation framework was created during the **first work experience
opportunity I received as a Junior QA Tester**.\
It helped me understand how a real QA automation project is structured
and how to write automated test cases using **Java**, **Selenium
WebDriver**, and **TestNG**.

------------------------------------------------------------------------

## 📑 Table of Contents

-   Introduction\
-   Project Structure\
-   Technologies Used\
-   Setup Instructions (Windows / macOS / Linux)\
-   How to Run Tests\
-   Test Suites\
-   Screenshot\
-   Notes

------------------------------------------------------------------------

## 🔹 Introduction

This project includes automated end-to-end scenarios such as:

-   Login & Logout\
-   Register New User\
-   Forgot Password Flow\
-   Creating Bookkeeping Transactions

Since this was my **first hands-on QA experience**, I focused on:

-   writing simple and clear test cases\
-   structuring tests correctly\
-   learning how to use TestNG suites\
-   following Page Object Model principles

------------------------------------------------------------------------

## 📁 Project Structure

    Zahler-Automation-Framework/
    │
    ├── src/
    │   ├── Base/
    │   │    └── BaseT.java
    │   │
    │   ├── Functional_TC/
    │   │    └── Create_Transaction.java
    │   │
    │   ├── main.resources.config/
    │   │    └── ConfigReader.java
    │   │
    │   ├── PageObject/
    │   │
    │   ├── Properties/
    │   │
    │   ├── Test.Forgot_Pass_TC/
    │   │    └── Forgot_password.java
    │   │
    │   ├── Test.User_TC/
    │        ├── Login_LogOut.java
    │        └── Register_New_User.java
    │
    ├── Regression.xml
    ├── testng.xml
    ├── pom.xml
    └── README.md

------------------------------------------------------------------------

## 🧰 Technologies Used

  Tool                     Purpose
  ------------------------ ----------------------------
  **Java 17**              Programming language
  **Selenium WebDriver**   Browser automation
  **TestNG**               Test execution & structure
  **Maven**                Build tool
  **Eclipse IDE**          Development

------------------------------------------------------------------------

## ⚙️ Setup Instructions (Windows / macOS / Linux)

### 1️⃣ Install Java 17+

``` bash
java -version
```

### 2️⃣ Install Maven

``` bash
mvn -version
```

### 3️⃣ Update Config File

    baseUrl=
    browser=chrome
    timeout=10

------------------------------------------------------------------------

## ▶️ How to Run Tests

``` bash
mvn test
```

Run suite:

``` bash
mvn test -DsuiteXmlFile=testng.xml
```

Run Regression:

``` bash
mvn test -DsuiteXmlFile=Regression.xml
```

Run single test:

``` bash
mvn -Dtest=Login_LogOut test
```

------------------------------------------------------------------------

## 📦 Test Suites Example

``` xml
<suite name="Zahler Automation Suite">
    <test name="User Tests">
        <classes>
            <class name="Test.User_TC.Login_LogOut"/>
            <class name="Test.User_TC.Register_New_User"/>
        </classes>
    </test>
</suite>
```

------------------------------------------------------------------------


------------------------------------------------------------------------

## 📝 Notes

This was the **first real QA work experience** I received.\
It helped me learn:

-   how automation frameworks are structured\
-   how to organize test cases\
-   how to use Selenium WebDriver\
-   how TestNG suites work\
-   how to follow POM\
-   how to run cross‑platform tests

More improvements will be added when the project will be back on production
