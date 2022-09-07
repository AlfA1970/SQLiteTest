package DAO;

import javax.swing.*;
import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class ConnectSQLite {

    private static final String SQLITE = "jdbc:sqlite:SQLDatabaseTest.db";
    private static File SQLDB;
    private static Connection conn;
    public static Connection getConnectSQLite() {

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(SQLITE);
            //JOptionPane.showMessageDialog(null, "Connected!!", "Message", INFORMATION_MESSAGE);
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error", "Message", JOptionPane.WARNING_MESSAGE);
            throw new RuntimeException(e);

        }

        return conn;
    }

}
