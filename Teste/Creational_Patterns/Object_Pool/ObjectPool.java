package Creational_Patterns.Object_Pool;

import java.util.ArrayList;
import java.util.List;

// Reusable object
class Connection {
    private String id;

    public Connection(String id) {
        this.id = id;
    }

    public void connect() {
        System.out.println("Connected to database with ID: " + id);
    }

    public void disconnect() {
        System.out.println("Disconnected from database with ID: " + id);
    }
}

// Object Pool
class ConnectionPool {
    private static final int MAX_POOL_SIZE = 5;
    private List<Connection> connections;

    public ConnectionPool() {
        connections = new ArrayList<>();
    }

    public Connection getConnection() {
        if (connections.isEmpty()) {
            if (connections.size() < MAX_POOL_SIZE) {
                Connection connection = createConnection();
                connections.add(connection);
                return connection;
            } else {
                System.out.println("Max pool size reached. Cannot create more connections.");
                return null;
            }
        } else {
            Connection connection = connections.remove(connections.size() - 1);
            return connection;
        }
    }

    public void releaseConnection(Connection connection) {
        if (connections.size() < MAX_POOL_SIZE) {
            connections.add(connection);
            System.out.println("Released connection to the pool.");
        } else {
            connection.disconnect();
            System.out.println("Connection pool is full. Connection discarded.");
        }
    }

    private Connection createConnection() {
        String id = generateConnectionId(); // generate a unique ID for the connection
        Connection connection = new Connection(id);
        connection.connect();
        return connection;
    }

    private String generateConnectionId() {
        // logic to generate a unique connection ID
        // (e.g., using a counter or random string generation)
        return "CON_" + System.nanoTime();
    }
}
