package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

     private static String url="jdbc:mysql://localhost:3306/college";
     private static String username="root";
     private static String password=".....";

    static String sql = "INSERT INTO Students (id, name, age, course, marks)\n" +
                        "VALUES (2, 'Riya', 82, 'JavaSE', 95)\n";

    public static void main( String[] args ) {
        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            Statement statement= connection.createStatement();
             int row = statement.executeUpdate(sql);

             System.out.println(row +"Row Inserted");
            System.out.println("Successfully Connceted");
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
