# RMI-Money-Conversion

This project demonstrates a simple implementation of Remote Method Invocation (RMI) in Java for a currency conversion service. It consists of a server that provides a remote method to convert a monetary amount from one currency to another (for simplification, the conversion rate is static), and a client that consumes this service to perform conversions and retrieve the server's current date and time.

## Server

### Services

- **IConvertisseurRemote:** This is a remote interface that declares two methods - one for performing the currency conversion and another to get the server's current date and time.
- **ConvertisseurImpl:** Implements the `IConvertisseurRemote` interface. It provides the logic for converting a monetary amount and getting the server's date.

### Main Server Class

- **Server:** Sets up the RMI environment, creates an instance of `ConvertisseurImpl`, and binds it to the RMI registry for the clients to locate and use.

## Client

- **Client:** Looks up the remote object in the RMI registry and invokes its methods to perform currency conversion and retrieve the server's current date and time.

## Setup and Execution

### Server

1. Navigate to the server's root directory.
2. Compile the Java files in the `ma/fstm/ilisi/rmimoneyconversion/server` directory.
3. Run the `Server` class to start the RMI registry and bind the remote object.

### Client

1. Ensure that the server is running and accessible.
2. Navigate to the client's root directory.
3. Compile the Java files in the `ma/fstm/ilisi/rmimoneyconversion/client` directory.
4. Run the `Client` class to look up the remote object and invoke its methods.

### Prerequisites

- Java Development Kit (JDK) installed on both server and client machines.
- The server and client have network access to each other (if running on different machines).

## Note

This example uses a static conversion rate and does not connect to any external APIs for real-time currency conversion rates. The purpose is to demonstrate RMI in Java, not to provide an accurate currency conversion service.
