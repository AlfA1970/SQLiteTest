import DAO.DAOUserImp;
import GUInterface.GuiUsers;

public class Controller {

    public Controller() {

        // TODO -> is needed to implement de charge rows from de SQLite user tables

        GuiUsers guiu = new GuiUsers();
        DAOUserImp dao = new DAOUserImp();
    }
}
