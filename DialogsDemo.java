import javax.swing.*;

public class DialogsDemo {
    public static void main(String[]args){
        int reply=JOptionPane.showConfirmDialog(null, //do we use an existing frame
                "Would you like green egs and ham?", //question asked of user
                "An inane question",  //custom title
                JOptionPane.YES_NO_OPTION); // icon displayed
        if(reply== JOptionPane.YES_OPTION){ //checking what the user replied.
            System.out.println("\f You typed yes.");
        } else{
            System.out.println("\f You typed no.");
        }
    }
}
