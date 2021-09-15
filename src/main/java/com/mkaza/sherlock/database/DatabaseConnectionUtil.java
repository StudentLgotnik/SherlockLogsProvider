package com.mkaza.sherlock.database;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionUtil {

    private static final Logger logger = LogManager.getLogger(DatabaseConnectionUtil.class);

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(System.getenv("DB_CONNECTION"));

            System.out.println("Got it!");

        } catch (SQLException e) {
            logger.error("Connection couldn't be opened!", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                logger.error("Can't close connection!", ex);
            }
        }
        return conn;
    }
}
