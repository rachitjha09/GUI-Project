import javax.swing.*;
import java.awt.*;

public class ButtonDemo4 {
    public static void main(String[]args){
        /*
        JButton button1 =new JButton("Button 1");
        JButton button2 =new JButton("Button 2");
        JButton button3 =new JButton("Button 3");
        JButton button4 =new JButton("Button 4");
        JButton button5 =new JButton("Button 5");
        JButton button6 =new JButton("Button 6");
        */

        JButton buttons[]={new JButton("Button 1"), new JButton("Button 2"),
                new JButton("Button 3"), new JButton("Button 4"), new JButton("Button 5"),
                new JButton("Button 6")};

        JFrame frame=new JFrame();
        frame.setLayout(new GridLayout(3,2));

        for(JButton j: buttons){
            frame.add(j);
        }
        /*
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        */

        frame.setSize(250, 400);
        frame.setVisible(true);
    }

}
