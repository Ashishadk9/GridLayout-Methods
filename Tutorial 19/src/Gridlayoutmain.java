import javax.swing.*;
import java.awt.*;

public class Gridlayoutmain {
    public static void main(String []args){
        JFrame frame = new JFrame("Title");
        frame.setLayout(new GridLayout(3,3));
        for(int i=1;i<=9;i++){
            frame.add(new JButton("button"+i));
        }
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
