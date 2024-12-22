# Java Exercises - File Transfer & Client-Server Communication

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

---

## Overview

In this repository, two Java exercises have been implemented to demonstrate file transfer and server-client communication using Java sockets.

### Exercise 1: **File Transfer Server & Client**
This exercise involves creating a basic file transfer system where a client can request and receive a file from a server over a network connection. The server listens for incoming client requests and sends the requested file if it exists.

### Exercise 2: **Client-Server Communication with File Retrieval**
This exercise expands on the previous one by adding more sophisticated handling for client-server communication. The client can request specific files from the server, and the server verifies the file's existence before sending it.

---

## Exercise 1: File Transfer Server & Client

### Description
In this exercise, a **File Server** listens for incoming client requests and sends the requested file over a socket connection. The **File Client** prompts the user to enter the name of a file they want to retrieve from the server. If the file is found, it is sent over the connection; otherwise, the client is informed that the file is not available.

### Execution Instructions

1. **Compile the code:**
   - Compile both the server and client classes using `javac`.

   ```bash
   javac FileServer.java FileClient.java
   ```

2. **Run the server:**
   - Start the file server first to begin listening for client requests.
   
   ```bash
   java FileServer
   ```

3. **Run the client:**
   - After starting the server, run the file client to request a file.
   
   ```bash
   java FileClient
   ```

4. **Interaction:**
   - The client will ask you to enter the name of the file you want to retrieve. If the file exists on the server, it will be sent over the network.

### Code

**FileServer.java**

```java
import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) throws IOException {
        int port = 12345;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server is running... Waiting for client connection.");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            String fileName = input.readLine();
            File file = new File(fileName);

            if (file.exists()) {
                output.writeBytes("File found. Sending it...\n");
                byte[] buffer = new byte[4096];
                try (FileInputStream fileInputStream = new FileInputStream(file)) {
                    int bytesRead;
                    while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                        output.write(buffer, 0, bytesRead);
                    }
                }
            } else {
                output.writeBytes("File not found on the server.\n");
            }

            socket.close();
        }
    }
}
```

**FileClient.java**

```java
import java.io.*;
import java.net.*;

public class FileClient {
    public static void main(String[] args) {
        try {
            String serverAddress = "localhost";
            int port = 12345;
            Socket socket = new Socket(serverAddress, port);

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println("Enter the name of the file you want to retrieve:");
            String fileName = input.readLine();

            output.writeBytes(fileName + "\n");

            String serverResponse = serverInput.readLine();
            System.out.println(serverResponse);

            if (serverResponse.equals("File found. Sending it...")) {
                FileOutputStream fileOutputStream = new FileOutputStream("received_" + fileName);
                byte[] buffer = new byte[4096];
                int bytesRead;
                InputStream serverStream = socket.getInputStream();
                while ((bytesRead = serverStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, bytesRead);
                }
                fileOutputStream.close();
                System.out.println("File received successfully.");
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Screenshots

*(Add relevant screenshots here showing the terminal output of both the client and server, such as the file transfer process and error handling if the file is not found.)*

---

## Exercise 2: Client-Server Communication with File Retrieval

### Description
In this exercise, the server has the ability to send files to the client on request, but it checks whether the file exists before sending it. If the file is not found, the server responds with an error message.

### Execution Instructions

1. **Compile the code:**
   - Compile both the server and client classes using `javac`.

   ```bash
   javac FileServer.java FileClient.java
   ```

2. **Run the server:**
   - Start the file server to listen for incoming connections.
   
   ```bash
   java FileServer
   ```

3. **Run the client:**
   - Start the file client and request a file.
   
   ```bash
   java FileClient
   ```

4. **Interaction:**
   - Enter the name of the file you want to retrieve when prompted by the client.

### Code

The code for this exercise is similar to Exercise 1, but with enhanced error handling and communication.

### Screenshots

*(Add relevant screenshots here showing the client-server interaction for file retrieval, such as requests and responses for both found and missing files.)*

---

## Conclusion

Both exercises demonstrate the basics of client-server communication and file transfer using Java. These exercises cover essential skills in network programming and can be further extended to support more advanced features like encryption, concurrent connections, or a graphical user interface (GUI). 

Feel free to modify the code to suit your needs or experiment with additional features.
