package com.bec.oop;

import java.sql.Connection;
import java.sql.DriverManager;
//class for database
public class Database{
    final String DB_URL = "jdbc:mysql://localhost/oop";
    final String USER = "root";
    final String PASS = "";
    
    public Connection connect() {
        // Open a connection
        String url;
        Connection con = null;
        url = "jdbc:mysql://localhost:3306/oop";
        try {
            //register the driver
            Class.forName("com.mysql.jdbc.Driver");
            //trying to connect to the database.
            con = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }        
        return con;    
    }    
}