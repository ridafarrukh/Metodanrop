import javax.swing.*;

/**
 * created by Rida Warsi
 * Date : 2020-11-18
 * Time : 22:52
 * Project : Metoderövning
 * Copyright : MIT
 */

public class loginDemo {
    public static void main(String[] args) {

        String user = JOptionPane.showInputDialog("Ange username");
        String pass = JOptionPane.showInputDialog("Ange pass");

        if (user.equals(Login.user) && pass.equals(Login.pass)){
            JOptionPane.showMessageDialog(null,"VÄlkommen");

        }


        else
            JOptionPane.showMessageDialog(null,"Felaktig användarnamn och lösenord");




    }
}
