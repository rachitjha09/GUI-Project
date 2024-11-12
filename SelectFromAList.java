import javax.swing.*;

public class SelectFromAList {
    public static void main(String[]args){
        Object[] possibilities={"ham", "spam", "yam"};
        String s=(String) JOptionPane.showInputDialog(
                null, //create a new frame for this dialog
                "Complete the sentence: \n" // question for user
                        + "\" Green eggs and...\"",
                "Customixed Dialog", //title
                JOptionPane.PLAIN_MESSAGE, //i think this is the font style
                null, //no icon/logo
                possibilities, //which strings go in the box
                "spam"); //default-shown to the user initially
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
