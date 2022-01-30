package windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class loginPage implements ActionListener {
    private JFrame frame;
    private String[] labels = {"Username: ", "Password: "};
    private JButton loginButton, registerButton;

    public loginPage(){
        frame = new JFrame("Login Page");

        JPanel panel = new JPanel(new SpringLayout());
        for(int i=0; i<labels.length; i++){
            JLabel label = new JLabel(labels[i], JLabel.TRAILING);
            panel.add(label);
            JTextField field = new JTextField(10);
            label.setLabelFor(field);
            panel.add(field);
        }
        loginButton = new JButton("LOGIN");
        loginButton.addActionListener(this);
        registerButton = new JButton("REGISTER");
        registerButton.addActionListener(this);
        panel.add(loginButton);
        panel.add(registerButton);
        SpringUtilities.makeCompactGrid(panel,
                3, 2, 6, 6, 6, 6);
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
        if (loginButton.equals(e.getSource())) {
            new mainWindow();
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        }
        else{
            if (registerButton.equals(e.getSource())) {
                new registerPage();
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        }
    }
}
