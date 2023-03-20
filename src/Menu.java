import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void start() throws IOException {
        Scanner scan =  new Scanner(System.in);

        int choise = 0;

        while (choise != 5){
            //simple menu prompt
            System.out.println("Welcome in WaveFlow, your personal project manager");
            System.out.println("What are we doing: ");
            System.out.println("1. Show records");
            System.out.println("2. Set new records");
            System.out.println("3. Delete records");
            System.out.println("4. Edit records");
            System.out.println("5. Exit");

                try {
                    choise = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("error - not a number");
                    break;
                }

            switch (choise){
                case 1:
                    ShowRecords.show();
                    break;
                case 2:
                    SetRecords.main();
                    break;
                case 3:
                    DeleteRecords.Delete();
                    break;
                case 4:
                    EditRecords.edit();
                    break;
                case 5:
                    choise = 5;
                    break;
                default:
                    System.out.println("NO!");
                    break;
            }
        }
        scan.close();
    }
}
