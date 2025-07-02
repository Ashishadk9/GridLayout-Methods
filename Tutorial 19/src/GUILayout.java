import javax.swing.*;
import java.awt.*;

public class GUILayout {
    public static void main(String[]args){
        JFrame frame=new JFrame("Combobox radiobutton and layout");
        frame.setLayout(new FlowLayout());
        String []arr={"apple","orange","ball","cat"};
        JComboBox comboBox= new JComboBox(arr);
        frame.add(comboBox);

        JPanel panel=new JPanel();
        panel.setSize(300,300);
        panel.setBackground(Color.BLACK);
        ButtonGroup buttonGroup=new ButtonGroup();
        JRadioButton radioButton1=new JRadioButton("Male");
        JRadioButton radioButton2=new JRadioButton("Female");
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        frame.add(radioButton1);
        frame.add(radioButton2);
        JTextArea textArea=new JTextArea("Others.");
        panel.add(textArea);
        frame.add(panel);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}