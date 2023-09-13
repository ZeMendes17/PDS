package Creational_Patterns.Object_Pool;

// Client code
public class ObjectPoolExample {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();

        Connection connection1 = pool.getConnection();
        Connection connection2 = pool.getConnection();
        Connection connection3 = pool.getConnection();

        pool.releaseConnection(connection2);

        Connection connection4 = pool.getConnection();
        Connection connection5 = pool.getConnection();
        Connection connection6 = pool.getConnection(); // Max pool size reached

        pool.releaseConnection(connection1);
        pool.releaseConnection(connection3);
        pool.releaseConnection(connection4);
        pool.releaseConnection(connection5);
        pool.releaseConnection(connection6); // Connection pool is full

        // Output:
        // Connected to database with ID: CON_47346503782940
        // Connected to database with ID: CON_47346504450659
        // Released connection to the pool.
        // Connected to database with ID: CON_47346504582124
        // Released connection to the pool.
        // Released connection to the pool.
        // Released connection to the pool.
        // Released connection to the pool.
        // Disconnected from database with ID: CON_47346504582124
        // Connection pool is full. Connection discarded.
    }
}
