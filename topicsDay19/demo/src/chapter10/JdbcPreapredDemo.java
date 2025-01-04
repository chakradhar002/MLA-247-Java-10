package chapter10;

import java.sql.*;

class Employee {
    // API for connecting to the database
    Connection ConnectDB() {
        String username = "root";
        String pwd = "root";
        String url = "jdbc:mysql://localhost:3307/testdb";
        Connection con = null;
        try {
            // Step 1: Load the MySQL JDBC driver
            System.out.println("Connecting...");
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection
            con = DriverManager.getConnection(url, username, pwd);

            // Step 3: Checking the connection
            System.out.println("Connected...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    // Create table for the first time
    void createEmployeeTable() {
        Connection con = ConnectDB();
        String dropTableSQL = "DROP TABLE IF EXISTS Employee";
        String createTable = "CREATE TABLE Employee (" +
                "id INT PRIMARY KEY, " +
                "LastName VARCHAR(255), " +
                "FirstName VARCHAR(255), " +
                "Address VARCHAR(255), " +
                "City VARCHAR(255))";
        try {
            Statement st = con.createStatement();
            st.execute(dropTableSQL);
            st.execute(createTable);
            System.out.println("Table created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Add a Employee record
    void addEmployeeRecord(int id, String lastName, String firstName, String address, String city) {
        Connection con = ConnectDB();
        String insertSQL = "INSERT INTO Employee (id, LastName, FirstName, Address, City) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(insertSQL);
            ps.setInt(1, id);
            ps.setString(2, lastName);
            ps.setString(3, firstName);
            ps.setString(4, address);
            ps.setString(5, city);
            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Record inserted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Retrieve all Employee records
    void getEmployeeRecords() {
        Connection con = ConnectDB();
        String selectSQL = "SELECT * FROM Employee";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectSQL);
            System.out.println("ID\tLastName\tFirstName\tAddress\t\tCity");
            System.out.println("---------------------------------------------------");
            while (rs.next()) {
                int id = rs.getInt("id");
                String lastName = rs.getString("LastName");
                String firstName = rs.getString("FirstName");
                String address = rs.getString("Address");
                String city = rs.getString("City");
                System.out.println(id + "\t" + lastName + "\t\t" + firstName + "\t\t" + address + "\t\t" + city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update a Employee record
    void updateEmployeeRecord(int id, String address, String city) {
        Connection con = ConnectDB();
        String updateSQL = "UPDATE Employee SET Address = ?, City = ? WHERE id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(updateSQL);
            ps.setString(1, address);
            ps.setString(2, city);
            ps.setInt(3, id);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete a Employee record
    void deleteEmployeeRecord(int id) {
        Connection con = ConnectDB();
        String deleteSQL = "DELETE FROM Employee WHERE id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(deleteSQL);
            ps.setInt(1, id);
            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Record deleted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

public class JdbcPreapredDemo {
    public static void main(String[] args) {
        Employee Employee = new Employee();
        
        // Create table
        Employee.createEmployeeTable();
        
        // Add records
        Employee.addEmployeeRecord(1, "Smith", "John", "123 Elm St", "New York");
        Employee.addEmployeeRecord(2, "Doe", "Jane", "456 Oak St", "Los Angeles");

        // Retrieve records
        System.out.println("\nEmployee Records:");
        Employee.getEmployeeRecords();

        // Update a record
        System.out.println("\nUpdating record...");
        Employee.updateEmployeeRecord(1, "789 Pine St", "San Francisco");

        // Retrieve records again
        System.out.println("\nEmployee Records after update:");
        Employee.getEmployeeRecords();

        // Delete a record
        System.out.println("\nDeleting record...");
        Employee.deleteEmployeeRecord(2);

        // Retrieve records again
        System.out.println("\nEmployee Records after deletion:");
        Employee.getEmployeeRecords();
    }
}
