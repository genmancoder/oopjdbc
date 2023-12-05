package com.bec.oop.utils;

import java.sql.Connection;
import java.sql.DriverManager;


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
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
        
        return con;
    
    }
}
