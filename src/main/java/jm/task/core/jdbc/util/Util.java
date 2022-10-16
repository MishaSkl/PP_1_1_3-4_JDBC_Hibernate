package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    private static Connection connection = null;

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "4815Ылд";


    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,USERNAME, PASSWORD);
            System.out.println("Успешно");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Ошибка");
        }
        return connection;
    }

}
