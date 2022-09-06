package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOUserImp implements DAOUser {

    Connection conn;
    Statement stmt;
    @Override
    public String[][] read() {

        String SQL = "SELECT * FROM users";
        conn = ConnectSQLite.getConnectSQLite();
        String[][] userList = new String[1][2];
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()) {
                String user = rs.getString("name");
                String password = rs.getString("password");
                System.out.println("user: " + user + "password: " + password);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public void insert() {

    }
}
