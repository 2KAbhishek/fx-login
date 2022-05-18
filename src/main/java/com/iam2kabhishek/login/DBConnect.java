package com.iam2kabhishek.login;

import java.sql.Connection;

public class DBConnect {

    public static Connection getConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = java.sql.DriverManager.getConnection("jdbc:sqlite:data/users.db");
            return conn;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
