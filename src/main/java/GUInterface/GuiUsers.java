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

    public GuiUsers(){
        initComponents();
    }

    private void initComponents() {
        setContentPane(jpMainUsers);
        setBounds(0,0,480,720);
        createTable();
        setVisible(true);
    }

    private void createTable(){
        String[] columns = {"Row","Username", "Password"};
        String[][] data = {
                {"1","Woody","9890Ykd"},
                {"2","Gabri","7852lkj"}
        };
        DefaultTableModel model = new DefaultTableModel(data,columns);
        tbUserList.setModel(model);

        TableColumnModel tc = new DefaultTableColumnModel();
        tc.setColumnMargin(3);

        JTableHeader th = new JTableHeader(tc);
        th.setTable(tbUserList);


    }
}
