package windows;

import objects.*;
import functions.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class registerPage implements ActionListener {
    private JFrame frame;
    private String[] labels = {"Name: ", "Surname: ", "Birthday: ", "birthTown: ", "Email: ", "Username: ", "Password: "};
    private JTextField[] fields = new JTextField[7];
    private JButton registerButton, abortButton;
    private JPanel panel;

    public registerPage(){
        frame = new JFrame("Register Page");

        panel = new JPanel(new SpringLayout());
        for(int i=0; i<labels.length; i++){
            JLabel label = new JLabel(labels[i], JLabel.TRAILING);
            panel.add(label);
            JTextField field = new JTextField(10);
            fields[i] = field;
            label.setLabelFor(field);
            panel.add(field);
        }
        registerButton = new JButton("REGISTER");
        registerButton.addActionListener(this);
        abortButton = new JButton("ABORT");
        abortButton.addActionListener(this);
        panel.add(registerButton);
        panel.add(abortButton);
        SpringUtilities.makeCompactGrid(panel,
                labels.length+1, 2, 6, 6, 6, 6);
        panel.setOpaque(true);
        frame.setContentPane(panel);

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (registerButton.equals(e.getSource())) {
            String[] datas = new String[7];
            for(int i=0; i<labels.length; i++){
                datas[i] = fields[i].getText();
            }
            Account acc = new Account(datas[0], datas[1], datas[2], datas[3], datas[4], datas[5], datas[6]);
            System.out.println(acc);
            new insertAccount(acc);
        }
        else{
            if (abortButton.equals(e.getSource())) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        }
    }
}
