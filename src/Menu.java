import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int choise = 0;

        while (choise != 5){
            System.out.println("1. Show records");
            System.out.println("2. Set new records");
            System.out.println("3. Delete records");
            System.out.println("4. Edit records");
            System.out.println("5. Exit");

            try{
                choise = scan.nextInt();
            } catch (InputMismatchException e){
                System.out.println("error - not a number, try again.");
                continue;  // wznowienie pętli
            }

            switch (choise){
                case 1:
                    new ShowRecords();
                    break;
                case 2:
                    new SetRecords();
                    break;
                case 3:
                    new DeleteRecords();
                    break;
                case 4:
                    new EditRecords();
                    break;
                default:
                    System.out.println("nieprawidłowa opcja");
                    break;
            }
        }
        scan.close();
    }
}
