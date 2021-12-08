import java.util.Scanner;

import src.RazKey;

public class main {
    public static void main(String[] arg){
        String createPass;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("\n\tEnter the new Passwod: ");
            createPass = input.next();
            // ask for user input
        }
        RazKey rk = new RazKey(createPass); 
        // create the new object of RazKey
        // object name (rk) is going to be the user name

        try {
            rk.connectSSH();
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        String pass;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\n\tEnter password to Log In: ");
            pass = input.next();
            // ask for user input
        }

        if (!rk.checkLogin(pass)){
            System.out.println("\n Wrong Password ...");
            System.exit(0);
        }
        // Checks if Login password is correct

        String file;
        String rorw;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("\n\tWhich file would you like to access to: ");
            file = input.next();
            // ask for user input
        }
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("\n\tWould you like to read or write: ");
            rorw = input.next();
            // ask for user input
        }

        if (!rk.checkChoice(file.charAt(0), rorw.charAt(0))){
            System.out.println("\n Wrong Choices ...");
            System.exit(0);
        }
        // Checks if Choice is correct
        // If not, then exit
    }
}
