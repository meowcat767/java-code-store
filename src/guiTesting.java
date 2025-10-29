import java.io.*;
import javax.swing.*;

public class guiTesting {
    public static void main(String[] args) {
        int clickcount = 0 // make sure we set the click count to 0
        JFrame frame = new JFrame("clicking simulator");
        System.out.println("Loaded JFrame!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // width x height
        frame.setVisible(true);
        JButton button = new JButton("Click me");
        frame.add(button);
        frame.setLocationRelativeTo(null);

        button.addActionListener(e -> {
            System.out.println("Clicked");
            JOptionPane.showMessageDialog(frame, "Clicked");
        });

    }
}
