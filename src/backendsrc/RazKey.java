package src;
import java.io.*;
//import java.util.Scanner;

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
        System.out.println("	**** check1 ****");
        if (pswInput.equals(password)){
            System.out.println("	**** Welcome Back ****");
            return true;
        }
        else {
            System.out.println("	**** check2 ****");
            //System.out.println("    Wrong password");
            return false;
        }
    }

    public boolean checkChoice(char choiceInput, String newInput){
        String dir = System.getProperty("user.dir");
        String abspath = dir + File.separator + "src" + File.separator;
        if (choiceInput == 'p'){
            abspath = abspath + "passwords.txt";
            read(abspath, newInput);
            return true;
        }
        else if (choiceInput == 'b'){
            abspath = abspath + "birthdays.txt";
            read(abspath, newInput);
            return true;
        }
        else if (choiceInput == 's'){
            abspath = abspath + "recepies.txt";
            read(abspath, newInput);
            return true;
        }
        return false;
    }

    public StringBuffer read(String filename, String newInput){
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
            sb.append(newInput);
            sb.append("\n");
            write(filename, newInput);
            fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return sb;
    }

    public void write(String filename, String newInput){
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

    public void connectSSH() throws InterruptedException{
        String dir = System.getProperty("user.dir");
        String abspath = dir + File.separator + "command.sh";
        ProcessBuilder pb = new ProcessBuilder(abspath);
        Process p;
        try {
            p = pb.start();
            p.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
