import javax.swing.*;
import java.awt.*;

public class ButtonDemo2 {
    public static void main(String[]args){
        JButton button1=new JButton("Button 1");
        JButton button2=new JButton("Button 2");
        JFrame frame=new JFrame();
        //put buttons side by side-not one on top of another
        frame.setLayout(new GridLayout());
        frame.add(button1);
        frame.add(button2);
        frame.setVisible(true);



    }
}
