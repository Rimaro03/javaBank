package windows;

import javax.swing.*;

public class mainWindow {
    public mainWindow() {
        JFrame frame = new JFrame("MAIN");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
    }
}
