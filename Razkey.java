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

    public void checkChoice(char choiceInput, char RorWInput){
        if (choiceInput == 'p'){
            if (RorWInput == 'r'){
                read('passwords.txt');
            }
            else if (RorWInput == 'w'){
                write('passwords.txt, );
            }
        }
        else if (choiceInput == 'b'){
            if (RorWInput == 'r'){
                read('birthdays.txt');
            }
            else if (RorWInput == 'w'){
                write('birthdays.txt', );
            }
        }
        else if (choiceInput == 's'){
            if (RorWInput == 'r'){
                read('recepies.txt');
            }
            else if (RorWInput == 'w'){
                write('recepies.txt', );
            }
        }
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

    void writeVarArgs(String...filename){
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
