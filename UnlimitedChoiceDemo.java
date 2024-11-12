import javax.swing.*;

public class UnlimitedChoiceDemo {
    public static void main(String[]args){
        String s=(String) JOptionPane.showInputDialog(
                null, //create a new frame for this dialog
                "Complete the sentence: \n" // question for user
                        + "\" Green eggs and...\"",
                "Customized Dialog", //title
                JOptionPane.PLAIN_MESSAGE, //i think this is the font style
                null, //no icon/logo
                null, //let user enter info
                "spam");

        //if a string was returned, say so.
        if((s!=null) && (s.length()>0)){
            System.out.println("\fGreen eggs and ... " + s + "!");
            return;
        }
        //if you're here, the return value was null/empty
        //this happens is user selects "CANCEL" or closes the window.
        System.out.println("\f you did not finish the sentence!");
    }
}
