package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("JDBC Connection Tester");

        if (args.length < 3){
            throw new Exception("Specify JDBC URL, Username, Password on command line");
        }

        String jdbcURL = args[0];
        String username = args[1];
        String password = args[2];

        System.out.println("JDBC URL: " + jdbcURL);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected to database server successfully.");
        } finally {
            if (conn != null) {
                conn.close();
            }
        }


    }
}