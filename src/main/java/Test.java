import DAO.ConnectSQLite;
import DAO.DAOUser;
import DAO.DAOUserImp;
import GUInterface.GuiUsers;

import javax.swing.*;
import java.sql.Connection;

public class Test {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GuiUsers gui = new GuiUsers();
                gui.initComponents();
            }
        });

        /*
        Connection conn = ConnectSQLite.getConnectSQLite();
        DAOUserImp daoUser = new DAOUserImp();
        daoUser.read();

         */
    }
}
