package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactsForm extends JFrame{
    private JPanel panel1;
    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textPhone;
    private JButton buttonCancel;
    private JButton buttonSalve;

    public ContactsForm () {

        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2 - getSize().width / 2, dim.height/2 - getSize().height/2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setListeners();
    }

    private void setListeners() {

        buttonSalve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // por enquanto nada ainda implementado ainda
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainForm();
                dispose();
            }
        });
    }
}
