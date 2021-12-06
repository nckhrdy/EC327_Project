import java.io.File;

public class CheckPoint {
    public static void main(String[] arg){
        RazKey rk = new RazKey("rabbit");
        rk.checkLogin("rabbit");

        String dir = System.getProperty("user.dir");
        String abspath = dir + File.separator;
        if (rk.checkChoice('p', 'r')){
            abspath += "passwords.txt";
            StringBuffer sb = rk.read(abspath);
            System.out.println((sb.toString()));
        }
    
        else{
            System.out.println("Boo");
        }

        //String abspath = dir + File.separator + "Final_Project" + File.separator + "EC327_Project" + File.separator + "passwords.txt";
        //String abspath = dir + File.separator + "passwords.txt";
        //StringBuffer sb = rk.read(abspath);
        //System.out.println(sb.toString());

    rk.write(abspath, "Blackboard:  asdfghjkl");
    }
}
