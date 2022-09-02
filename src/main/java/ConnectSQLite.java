import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectSQLite {

    private static final String SQLITE = "jdbc:sqlite:/Users/aagusti/IdeaProjects/SQLiteTest/src/main/resources/database/SQLDatabseTest.db";
    private static File SQLDB;
    private static Connection conn;
    public static Connection getConnectSQLite() {

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(SQLITE);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return conn;
    }

}
