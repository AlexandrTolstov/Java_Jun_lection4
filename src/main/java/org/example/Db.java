package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {
    private static final String URL = "jdbc:mysql://localhost:3306";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static void con(){
        try(Connection con = DriverManager.getConnection(URL, USER, PASSWORD)){
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }


}
