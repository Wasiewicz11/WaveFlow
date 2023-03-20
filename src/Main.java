import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    //indicates path to main directory
    public static String path = null;
    public static void main(String[] args) throws IOException {
        createDir();
        System.out.println(path);
        Menu.start();
    }

    private static void createDir() {

        String username = System.getProperty("user.name");
        StringBuilder sb = new StringBuilder();
        sb.append("C:\\Users\\");
        sb.append(username);
        sb.append("\\Documents\\WaveFlowDocs");
        path = sb.toString();
        File dir = new File(path);

        //checks if directory exists - if not, creates directory
        if (!dir.exists())
            dir.mkdirs();


        //creates new file in dir or checks if it even exists
        try {
            File file = new File(path + "\\data.txt");
            if (!file.exists()){
                file.createNewFile();
                System.out.println("Data file created");
            }
        }catch (IOException e){
            System.out.println("error");
        }
    }

}