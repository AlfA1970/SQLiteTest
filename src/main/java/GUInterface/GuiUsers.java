package GUInterface;

import javax.swing.*;
import javax.swing.table.*;

public class GuiUsers extends JFrame{
    private JPanel jpMainUsers;
    private JPanel jpTableListUsers;
    private JTextField tfUsername;
    private JTextField tfPassword;
    private JButton btnSave;
    private JTable tbUserList;
    private JButton btnQuit;
    private JButton btnRefresh;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JLabel lbUsername;
    private JLabel lbPassword;
    private JPanel jpTable;
    private JPanel jpTableButtons;

    public  GuiUsers(){

    }

    public void initComponents() {
        setContentPane(jpMainUsers);
        setBounds(0,0,480,720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createTable();
        setVisible(true);
    }

    private void createTable(){
        String[] columns = {"Row","Username", "Password"};
        String[][] data = {
                {"1","Woody","9890Ykd"},
                {"2","Gabri","7852lkj"},
                {"1","Hole","876tghf"}
        };
        DefaultTableModel model = new DefaultTableModel(data,columns);
        tbUserList.setModel(model);

        JTableHeader th = tbUserList.getTableHeader();
        th.setTable(tbUserList);
        TableColumnModel tcolumns = tbUserList.getColumnModel();




    }
}
