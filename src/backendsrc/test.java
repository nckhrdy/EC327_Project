package src;
import java.util.Scanner;

public class test {
    public static void main(String[] arg){
        String createPass = in("Enter the new Password");
        /*
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("\n\tEnter the new Passwod: ");
            createPass = input.next();
            // ask for user input
        }
        */
        RazKey rk = new RazKey(createPass); 
        // create the new object of RazKey
        // object name (rk) is going to be the user name
        /*
        try {
            rk.connectSSH();
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

        // String pass;
        /*
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\n\tEnter password to Log In: ");
            String pass = input.next();
            return pass;
            // ask for user input
        }
        */
        String pass = in("Enter your Password");

        boolean can = false;
        while (!can){
            if (rk.checkLogin(pass)){
                can = true;
            }
            else {
                pass = in("Wrong Password ... \n Enter again");
            }
        }
        /*
        if (!rk.checkLogin(pass)){
            System.out.println("\n Wrong Password ...");
            System.exit(0);
        }
        // Checks if Login password is correct
        */

        String file = in("Which file would you like to access to: ");
        // String rorw = in("Would you like to read or write: ");

        String newInput = "";
        newInput = in("Enter new data (Enter no if not): ");

        if (newInput.equals("no") || newInput.equals("No")){
            newInput = "";
        }
        boolean can2 = false;
        while(!can2){
            if (rk.checkChoice(file.charAt(0), newInput)){
                can2 = true;
            }
            else {
                file = in("Which file would you like to access to: ");
                newInput = in("Would you like to add anything ?");
            }
        }
        /*
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("\n\tWhich file would you like to access to: ");
            file = input.next();
            // ask for user input
        }
        */

        /*
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
        */
    }
    
    private static String in(String promp){
       Scanner input = new Scanner(System.in);
            while (true) {
            System.out.println(promp);
            try {
                return input.next();
            }
            catch (java.util.InputMismatchException e) {
                e.printStackTrace();
            }
        }
    }
}
