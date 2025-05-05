package jm.task.core.jdbc.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Util {
    // Настройки подключения к базе данных
    private final static String DB_URL = "jdbc:mysql://localhost:3306/katadbusers";
    private final static String USER = "admin";
    private final static String PASSWORD = "admin";

    /**
     * Метод получает соединение с базой данных.
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }
}
