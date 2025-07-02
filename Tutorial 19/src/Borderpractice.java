import javax.swing.*;
import java.awt.*;

public class Borderpractice {
    public static void main(String[] args) {
        try {
            // Set a more permissive Look and Feel
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("combobox radiobutton and layout");
        frame.setLayout(new BorderLayout());

        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        JButton button3 = new JButton("Button3");
        JButton button4 = new JButton("Button4");
        JButton button5 = new JButton("Button5");

        // Configure buttons to show background colors properly
        button1.setBackground(Color.GREEN);
        button1.setOpaque(true);

        button5.setBackground(Color.BLACK);
        button5.setOpaque(true);
        button5.setForeground(Color.WHITE); // Set text color to be visible on black

        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.EAST);
        frame.add(button4, BorderLayout.WEST);
        frame.add(button5, BorderLayout.CENTER);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}