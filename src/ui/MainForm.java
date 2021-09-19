package ui;

//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

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemove;
    private JTable tableContacts;

    public MainForm() {

        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2 - getSize().width/2, dim.height/2 - getSize().height/2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setListeners();
    }

    private void setListeners() {

        buttonNewContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ContactsForm();
                dispose();
            }
        });

        buttonRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // por enquanto nada implementado ainda
            }
        });
    }
}
