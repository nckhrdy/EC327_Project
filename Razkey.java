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
    
    public String NewInput; 
    //public string for the NewInput
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

    public void checkChoice(char choiceInput){
        
        if (choiceInput == 'p'){ read('passwords.txt'); }
        
        else if (choiceInput == 'b'){ read('birthdays.txt'); }
        
        else if (choiceInput == 's'){ read('recepies.txt'); }
            
        else return 0;
    } 
   
 
    StringBuffer read(String filename, char RarWInput){
        StringBuffer sb = new StringBuffer();
        try{
             if (RorWInput == 'w') //checking if the user wants to write to file
            {
                 //use string buffer to append to the end of the file
            }
            else { //read through the fil
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
        }

        return sb;
    }

//    void write(String filename, String newInput){
//         try{
//             FileWriter writer = new FileWriter(filename, true);
//             writer.write("\n");
//             writer.write(newInput);
//             writer.close();
//         }
//         catch (IOException e){
//             e.printStackTrace();
//         }
//     }
}
