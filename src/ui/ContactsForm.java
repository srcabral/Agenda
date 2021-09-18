package ui;

import javax.swing.*;

public class ContactsForm extends JFrame{
    private JPanel panel1;
    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textPhone;
    private JLabel label1;
    private JLabel label2;
    private JButton buttonCancel;
    private JButton buttonSalve;

    public ContactsForm () {

        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);
    }
}
