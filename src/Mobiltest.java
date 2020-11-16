import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * created by Rida Warsi
 * Date : 2020-11-16
 * Time : 21:17
 * Project : Metoderövning
 * Copyright : MIT
 */

public class Mobiltest {
    public static void main(String[] args) {
        /*
        String s;
        s = JOptionPane.showInputDialog("Ange Antal samtal?");
        int samtal  = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("Ange Antalet minuter under Dagtid?");
        int minuter = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("Ange Antalet minuter övrig tid");
        int minuterövr = Integer.parseInt(s);

        double kos = Mobil.månadskostnad(samtal,minuter,minuterövr);
        JOptionPane.showMessageDialog(null,"Kostnad:" + kos + " kr ");



         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ange antal samtal");
        String s = scan.nextLine();
        int samtal = Integer.parseInt(s);
        System.out.println("ange minuter");
        String minuts = scan.nextLine();
        int min = Integer.parseInt(minuts);
        System.out.println("Ange Antalet minuter övrig tid");
        String övrtid = scan.nextLine();
        int min2 = Integer.parseInt(övrtid);
        double kos = Mobil.månadskostnad(samtal,min,min2);

        System.out.println("Kostnad: "+ kos + " kr ");





    }
}
