package com.absenceManagement.dao;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static String url = "jdbc:mysql://localhost:3306/absenceManagement";
    private static String user = "root";
    private static String password = "";

    private Database(){};
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,user,password);
    }
}
