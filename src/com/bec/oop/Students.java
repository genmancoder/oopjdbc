package com.bec.oop;

import com.bec.oop.utils.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Students {

    Connection conn;
    Database db = new Database();

    public void viewStudent(String id) {

    }



    public void insertStudent() {

    }

    public void updateStudent(String id) {
        //update student set firstname = ? where id = ?
    }

    public void deleteStudent(String id) {
        //delete from student where firstname = "John"
    }

}
