import java.io.File;
import java.io.IOException;

public class command_test {

    public static void main(String[] arg) throws InterruptedException {
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
