package com.project.db;

import java.sql.*;

public class DBService {
    private static final String URL = "jdbc:mysql://localhost:3306/myDbTest";
    private static final String USERNAME = "ana";
    private static final String PASSWORD = "A212257";

    private Connection connection;
    public DBService() {
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }
}
