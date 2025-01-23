package com.mycompany.eva3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/Login"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 
    private static Connection connection;
    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                System.out.println("Error: Driver no encontrado.");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error: No se pudo establecer la conexión a la base de datos.");
            }
        }
        return connection;
    }
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null; // Reset connection to null after closing
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error: No se pudo cerrar la conexión.");
            }
        }
    }
}