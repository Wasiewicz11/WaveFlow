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
    private static String path = null;
    public static void main(String[] args) {
        createDir();
        new Menu();

        //simple prompt
        System.out.println("Welcome in WaveFlow, your personal project manager");
        System.out.println("What are we doing: ");

    }

    private static void createDir() {
        Scanner scan = new Scanner(System.in);

        //sprawdza czy pik ma folder z danymi
        //sprawdza czy plik txt istnieje - sprawdza to z path stworzonym w domyslnym folderze?

        String username = System.getProperty("user.name");
        StringBuilder sb = new StringBuilder();
        sb.append("C:\\Users\\");
        sb.append(username);
        sb.append("\\Documents\\WaveFlowDocs");
        path = sb.toString();
        File dir = new File(path);

        //checks if file exists
        if (!dir.exists())
            dir.mkdirs();


        //creates new file in dir or checks if it even exists
        try {
            File file = new File(path + "\\data.txt");
            if (!file.exists()){
                file.createNewFile();
                System.out.println("ŁOOOOOOO");
            }
        }catch (IOException e){
            System.out.println("pojebalo");
        }
    }

}