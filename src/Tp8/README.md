# Network Programming , File Transfer & Client-Server Communication 

This repository contains two Java exercises related to file transfer and client-server communication, implemented with socket programming and basic Java I/O. Each exercise demonstrates essential concepts such as client-server communication, file handling, and networking.

## Table of Contents

1. [Overview](#overview)
2. [Exercise 1: File Transfer Server & Client](#exercise-1-file-transfer-server--client)
   - [Description](#description)
   - [Execution Instructions](#execution-instructions)
   - [Code](#code)
   - [Screenshots](#screenshots)
3. [Exercise 2: Client-Server Communication with File Retrieval](#exercise-2-client-server-communication-with-file-retrieval)
   - [Description](#description-1)
   - [Execution Instructions](#execution-instructions-1)
   - [Code](#code-1)
   - [Screenshots](#screenshots-1)
4. [Conclusion](#conclusion)


## Overview

In this repository, two Java exercises have been implemented to demonstrate file transfer and server-client communication using Java sockets.


## Exercise 1: Magic Number Game

A simple game where a client connects to a server to guess a randomly generated magic number between 0 and 100.

### **Features**
- The server generates a magic number and listens for client connections.
- Multiple clients can connect to the server simultaneously (multithreading enabled).
- Clients can guess the number and receive feedback (`"It's higher!"`, `"It's lower!"`, or `"Congratulations!"`).

### **How to Run**
1. Compile `Server.java` and `Client.java` using `javac`.
2. Run the server:
   ```bash
   java Tp8.Exercise1.Server
   ```
3.Run the client:
   ```bash
   java Tp8.Exercise1.Server
 ```
4.Follow the prompts on the client console to guess the magic number.

### **Code**
**Server.java**

   ![image_alt( https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp8/screenshots/Server.PNG)

   ![image_alt( https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp8/screenshots/ClientHandler1.PNG)
   
**FileClient.java**

   ![image_alt( https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp8/screenshots/Client.PNG)

### **Execution**

   ![image_alt( https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp8/screenshots/exec.PNG)

## Exercise 2: Client-Server Communication with File Retrieval

In this exercise, the server has the ability to send files to the client on request, but it checks whether the file exists before sending it. If the file is not found, the server responds with an error message.

### **Features**
- The server maintains a directory of files and listens for client connections.
- Clients can request a specific file by name.
- The server checks for the file's existence and sends it if available.
- Secure file transfer:
   -Prevents directory traversal attacks by sanitizing file names.
   -Supports large file transfer using an efficient buffer-based approach.

### **How to Run**
1. Ensure the server_files directory is created in the same directory as the server program.
2. Place the desired files to be shared in the server_files directory.
3.Compile and run FileServer.java:
   ```bash
    java Tp8.Exercise2.FileServer
   ```
4.Compile and run FileClient.java (client-side program):
   ```bash
    java Tp8.Exercise2.FileClient
   ```
5.Follow the prompts on the client console to download files.

### Code

**FileServer.java**

   ![image_alt( https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp8/screenshots/FileServer.PNG)

   ![image_alt( https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp8/screenshots/ClientHandler.PNG)
   
**FileClient.java**

   ![image_alt( https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp8/screenshots/FileClient.PNG)


### Execution 
   ![image_alt( https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp8/screenshots/exec2.PNG)

   ![image_alt( https://github.com/malakzaidi/Tps_POO_SDIA1/blob/main/src/Tp8/screenshots/exec23.PNG)

## Conclusion

Both exercises demonstrate the basics of client-server communication and file transfer using Java. These exercises cover essential skills in network programming and can be further extended to support more advanced features like encryption, concurrent connections, or a graphical user interface (GUI). 

## Requirements
- Java Development Kit (JDK): Version 8 or later (tested on JDK 21).
- IDE/Editor: Recommended for managing multiple files (e.g., IntelliJ IDEA, Eclipse, VS Code).

## Highlights
- Multithreading
Both exercises use multithreading to handle multiple client connections simultaneously.
- Efficient File Transfer
The file-sharing server leverages an 8KB buffer to ensure efficient file transmission, especially for large files.
- Security
The file-sharing server prevents directory traversal attacks by sanitizing user input.

## Possible Enhancements
- Add authentication for secure access to the server.
- Extend the magic number game to include more features like leaderboards or score tracking.
- Implement file upload functionality in the file-sharing server.

## Author
[Malak Zaidi]
A student project showcasing basic network programming concepts in Java.
