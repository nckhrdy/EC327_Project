//import java.util.Scanner;
import java.io.*;

public class RazKey
{
    /*
    public static void main(String[] args)
    {
        String password = "rabbit";
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("\n\tEnter User Password: ");
            String userLogin = input.next();
            
            while (!userLogin.equals(password))
            {
                System.out.print("\n\tEnter User Password: ");
                userLogin = input.next();
            }
        }
        System.out.println("\n\n\tSelect a folder\n\t  PASSWORDS\n\t  BIRTHDAYS\n\t  RECIPIES");
    }
    */
    

    private String password;
    //private String filename;

    public RazKey(String newpass){
        password = newpass;
    }

    public boolean checkLogin(String pswInput){
        if (pswInput == password){
            System.out.println("	**** Welcome Back ****");
            return true;
        }
        else {
            System.out.println("    Wrong password");
            return false;
        }
    }

    public boolean checkChoice(char choiceInput, char RorWInput){
        if (choiceInput == 'p'){
            if (RorWInput == 'r'){
                return true;
            }
            else if (RorWInput == 'w'){
                return true;
            }
            else return false;
        }
        else if (choiceInput == 'b'){
            if (RorWInput == 'r'){
                return true;
            }
            else if (RorWInput == 'w'){
                return true;
            }
            else return false;
        }
        else if (choiceInput == 's'){
            if (RorWInput == 'r'){
                return true;
            }
            else if (RorWInput == 'w'){
                return true;
            }
            else return false;
        }
        else return false;

    }

    StringBuffer read(String filename){
        StringBuffer sb = new StringBuffer();
        try{
            File file = new File(filename);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                sb.append(line);
                sb.append("\n");
            }
            fr.close();
        }

        catch(IOException e){
            e.printStackTrace();
        }

        return sb;
    }

    void write(String filename, String newInput){
        try{
            FileWriter writer = new FileWriter(filename, true);
            writer.write("\n");
            writer.write(newInput);
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}