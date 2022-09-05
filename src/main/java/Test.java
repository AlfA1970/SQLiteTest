import DAO.ConnectSQLite;
import DAO.DAOUser;
import DAO.DAOUserImp;
import GUInterface.GuiUsers;

import java.sql.Connection;

public class Test {

    public static void main(String[] args) {

        GuiUsers gui = new GuiUsers();
        Connection conn = ConnectSQLite.getConnectSQLite();
        DAOUserImp daoUser = new DAOUserImp();
        daoUser.read();
    }
}
