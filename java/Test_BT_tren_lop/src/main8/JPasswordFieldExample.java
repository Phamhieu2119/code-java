package main8;

import javax.swing.*;
import java.awt.*;

public class JPasswordFieldExample extends JFrame {
    public JPasswordFieldExample() {
        setTitle("JPasswordField Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter Password:");
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        add(panel, BorderLayout.CENTER);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new JPasswordFieldExample();
    }
}
