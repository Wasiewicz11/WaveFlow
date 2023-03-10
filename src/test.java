import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String uPath = scan.next();
        String path = null;

        Pattern p = Pattern.compile("[A-Z]:\\\\.");
        Matcher m = p.matcher(uPath);
        if (uPath == "D"){
            System.out.println("Path set as deafult");
        } else if (m.find()){
            System.out.println("Path set as: " + uPath);
            path = uPath;
        }

        System.out.println("path: "  + path  );
        System.out.println("uPath: " + uPath );
    }
}
