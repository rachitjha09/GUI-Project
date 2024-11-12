import javax.swing.*;

public class PanelDemo7 {
    public static void main(String[]args){
        JButton[] buttons =new JButton[10];
        for(int i=0; i<10; i++){
            buttons[i]=new JButton("Button" + (i+1));
        }
    }
}
