import javax.swing.*;
import java.util.Scanner;

/**
 * created by Rida Warsi
 * Date : 2020-11-18
 * Time : 21:58
 * Project : Metoderövning
 * Copyright : MIT
 */

public class MetodDemo {
    public static void main(String[] args) {
     /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange första talet?");
        String s = scan.nextLine();
        int tal1 = Integer.parseInt(s);

        System.out.println("Ange andra talet?");
        String s1 = scan.nextLine();
        int tal2 = Integer.parseInt(s1);

        double mv = Medelklass.medelv(tal1, tal2);
        System.out.println("Medelvärde: " + mv );


      */
        String s;
        s = JOptionPane.showInputDialog("Ange första talet?");
        double x = Double.parseDouble(s);
        s = JOptionPane.showInputDialog("Ange andra talet?");
        double y = Double.parseDouble(s);

        double mv = Medelklass.medelv(x,y);
        JOptionPane.showMessageDialog(null,"Medelvärde: " + mv);



    }
}
