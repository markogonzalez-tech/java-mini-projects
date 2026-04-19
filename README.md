# Java Mini Projects

This repository contains a collection of small Java console applications designed to practice core programming concepts and improve problem-solving skills.

---

## Projects

### Calculator
Basic calculator that performs simple arithmetic operations.

### Calculator Menu
Interactive console calculator with a menu system that allows the user to choose different operations.

**Features:**
- Menu-based system
- Addition, subtraction, multiplication, division
- Loop execution until exit
- Division by zero validation

**Concepts used:**
- Switch statements
- Loops
- Basic error handling
- Console interaction

---

### Guess Number Game
A simple console game where the user tries to guess a random number between 1 and 100.

**Concepts used:**
- Scanner
- Random class

---

### Number Guess with Attempts
Improved version of the guessing game that includes an attempt counter.

**Concepts used:**
- Loops
- Conditional statements
- Counters

---

### Password Checker
Basic password validation system.

**Concepts used:**
- String validation
- Conditional logic

---

### Login System Basic
A simple authentication system that validates a username and password entered by the user.

**Concepts used:**
- Scanner
- Conditional statements
- String comparison

---

## Technologies

- Java

---

## Purpose

The purpose of this repository is to strengthen fundamental Java skills, understand core programming concepts, and build a solid foundation for more advanced projects.

# Login System with Attempts (Java)

## Description
This project is an improved version of a basic login system in Java. It allows the user to enter credentials and limits the number of login attempts.

## Technologies Used
- Java
- Scanner class for user input

## Functionality
- Prompts the user for username and password
- Validates credentials against predefined values
- Allows a maximum of three attempts
- Displays remaining attempts after each failed login
- Locks access after exceeding the allowed attempts

## Project Objective
The objective of this project is to improve understanding of loops, conditional logic, and control flow in Java by implementing a more realistic authentication mechanism.

## How to Run

1. Compile the file:
   javac LoginSystemAttempts.java

2. Run the program:
   java LoginSystemAttempts

   # Login System with File Storage (Java)

## Description
This project is a simple authentication system that validates user credentials stored in an external file. It simulates a more realistic login system by reading data from a file instead of using hardcoded values.

## Technologies Used
- Java
- File handling (File, Scanner)
- Console input

## Functionality
- Reads user credentials from a text file
- Prompts the user to enter username and password
- Compares input with stored data
- Grants or denies access based on validation

## Project Structure
- `src/` → Source code
- `data/` → User data file

## Project Objective
The goal of this project is to introduce file handling in Java and simulate a more realistic authentication system.

## How to Run

1. Make sure the `data/users.txt` file exists

2. Compile the program:
   javac LoginSystemFile.java

3. Run the program:
   java LoginSystemFile
