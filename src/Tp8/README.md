# Network Programming, File Transfer & Client-Server Communication

This repository contains two Java exercises related to file transfer and client-server communication, implemented with socket programming and Java I/O. Each exercise demonstrates essential concepts such as client-server communication, file handling, and networking.

---

## Table of Contents

1. [Overview](#overview)  
2. [Exercise 1: Magic Number Game](#exercise-1-magic-number-game)  
   - [Features](#features)  
   - [How to Run](#how-to-run)  
   - [Code](#code)  
   - [Screenshots](#screenshots)  
3. [Exercise 2: File Retrieval System](#exercise-2-file-retrieval-system)  
   - [Features](#features-1)  
   - [How to Run](#how-to-run-1)  
   - [Code](#code-1)  
   - [Screenshots](#screenshots-1)  
4. [Conclusion](#conclusion)  
5. [Requirements](#requirements)  
6. [Highlights](#highlights)  
7. [Possible Enhancements](#possible-enhancements)  
8. [Author](#author)  

---

## Overview

This repository contains two exercises:  
1. **Magic Number Game:** A simple game where clients guess a randomly generated magic number on a server.  
2. **File Retrieval System:** A file-sharing application where clients request files from a server.  

---

## Exercise 1: Magic Number Game

### Features
- Server generates a random magic number and listens for client connections.  
- Supports multiple clients simultaneously (via multithreading).  
- Provides feedback to clients based on their guesses (`"It's higher!"`, `"It's lower!"`, or `"Congratulations!"`).  

### How to Run
1. Compile `Server.java` and `Client.java`:  
   ```bash
   javac Tp8/Exercise1/Server.java Tp8/Exercise1/Client.java
   ```  
2. Run the server:  
   ```bash
   java Tp8.Exercise1.Server
   ```  
3. Run the client:  
   ```bash
   java Tp8.Exercise1.Client
   ```  
4. Follow the console prompts on the client to guess the number.

### Code
**Server.java:**  
![Server Code](src/Tp8/screenshots/Server.PNG)  

**Client.java:**  
![Client Code](src/Tp8/screenshots/Client.PNG)  

### Screenshots
**Execution Example:**  
![Execution Example](src/Tp8/screenshots/exec.PNG)  

---

## Exercise 2: File Retrieval System

### Features
- Server maintains a directory of files and listens for client requests.  
- Clients can request specific files by name.  
- Server validates file existence before transfer and sends an error message if the file is unavailable.  
- **Security Features:**  
  - Prevents directory traversal attacks.  
  - Efficient file transfer using an 8KB buffer.  

### How to Run
1. Ensure the `server_files` directory exists in the same location as `FileServer.java`.  
2. Add desired files to `server_files`.  
3. Compile and run `FileServer.java`:  
   ```bash
   javac Tp8/Exercise2/FileServer.java  
   java Tp8.Exercise2.FileServer
   ```  
4. Compile and run `FileClient.java`:  
   ```bash
   javac Tp8/Exercise2/FileClient.java  
   java Tp8.Exercise2.FileClient
   ```  
5. Follow the client console prompts to request files.

### Code
**FileServer.java:**  
![FileServer Code](src/Tp8/screenshots/FileServer.PNG)  

**FileClient.java:**  
![FileClient Code](src/Tp8/screenshots/FileClient.PNG)  

### Screenshots
**File Transfer Example:**  
![Execution Example](src/Tp8/screenshots/exec2.PNG)  

**Large File Transfer Example:**  
![Large File Execution Example](src/Tp8/screenshots/exec23.PNG)  

---

## Conclusion

These exercises illustrate the basics of client-server communication and file transfer using Java. They showcase important concepts in network programming and provide a foundation for building more advanced systems.  

---

## Requirements
- **Java Development Kit (JDK):** Version 8 or later (tested on JDK 21).  
- **IDE/Editor:** Recommended for managing multiple files (e.g., IntelliJ IDEA, Eclipse, VS Code).  

---

## Highlights
- **Multithreading:** Both exercises use multithreading to handle multiple client connections.  
- **Efficient File Transfer:** The file-sharing server employs an 8KB buffer for fast and reliable transfers.  
- **Security:** Prevents directory traversal attacks by sanitizing file names.  

---

## Possible Enhancements
1. Add authentication for secure server access.  
2. Extend the Magic Number Game to include leaderboards or score tracking.  
3. Add file upload functionality to the file-sharing server.  

---

## Author

[Malak Zaidi](https://github.com/malakzaidi)  
Student project showcasing basic network programming concepts in Java.
