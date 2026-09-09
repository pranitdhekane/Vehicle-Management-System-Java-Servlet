package com.vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    public Connection makeConnection() throws ClassNotFoundException, SQLException {

        String dbDriver = "com.mysql.cj.jdbc.Driver";
        String dbURL = "jdbc:mysql://localhost:3306/";
        String dbName = "demo";
        String dbUsername = "pranit";
        String dbPassword = "project";

        Class.forName(dbDriver);

        Connection con = DriverManager.getConnection(
                dbURL + dbName,
                dbUsername,
                dbPassword
        );

        return con;
    }
}
