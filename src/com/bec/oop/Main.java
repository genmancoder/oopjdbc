
package com.bec.oop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Main {

    //import java sql package
    //load and register the driver
    //establish a connection
    //create a statement
    //execute 
    //retrieve a result
    //close the statement and connection
    static Database db = new Database();
    static Connection conn = db.connect();
    
    public static void main(String[] args) {

        
                deleteStudent("3");
        
            
            
            //view all students
            //select * from students

            try{
                String sql = "select * from students";
                PreparedStatement ps = conn.prepareStatement(sql);
                
                ResultSet rs = ps.executeQuery();
                
                while(rs.next()){
                    System.out.println("Id " + rs.getInt("id") + 
                            " First Name: " + rs.getString("firstname")  
                            + " Last Name: " + rs.getString("lastname")  + 
                            " Address: " + rs.getString("address"));
                }
                
            }catch(Exception ex){
                
            }
            
    }
    
    //update student
    public static void deleteStudent(String id){
        
         try{
                String sql = "delete from students where id  = " + id;
                PreparedStatement ps = conn.prepareStatement(sql);
                
                int res = ps.executeUpdate();
                
                if(res > 0){
                    System.out.println("Student " + id +" has been deleted.");
                }else{
                    System.out.println("there were errors while deleting the student record.");
                }
                
                
                
            }catch(Exception ex){
                System.out.println("" + ex.getMessage());
            }
    }

}
