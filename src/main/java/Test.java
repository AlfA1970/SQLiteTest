import DAO.ConnectSQLite;
import DAO.DAOUser;
import DAO.DAOUserImp;

import java.sql.Connection;

public class Test {

    public static void main(String[] args) {
        Connection conn = ConnectSQLite.getConnectSQLite();
        DAOUserImp daoUser = new DAOUserImp();
        daoUser.read();
    }
}
