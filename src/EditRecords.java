import java.io.IOException;
import java.util.Scanner;

public class EditRecords {
    public static void edit() throws IOException {

        //show records that already exists
        ShowRecords.show();
        Job[] jobs = ShowRecords.readData();

        //chose project to edit
        Scanner scan = new Scanner(System.in);
        System.out.println("Write number of project which you want to edit");
        byte id = scan.nextByte();
        id--;

        //show chosen project data
        jobs[id].toString();



        //                                 -EDITING PROJECT-
        byte a = 0;
        while (a != -1) {
            System.out.println(
                    "Which parameter do you want to edit? " +
                    "Write exact name of parameter (example: bridePhoneNr:)" +
                    "\nIf you want to leave type \"exit\""
            );
            String option = scan.next();

            switch (option) {
                case "date":
                    System.out.println("Write new date: ");
                    jobs[id].date = scan.next();
                    break;
                case "names":
                    System.out.println("Write new names: ");
                    jobs[id].names = scan.next();
                    break;
                case "location":
                    System.out.println("Write new location: ");
                    jobs[id].names = scan.next();
                    break;
                case "groomPhoneNr":
                    System.out.println("Write new groom phone number: ");
                    jobs[id].groomPhoneNr = scan.nextInt();
                    break;
                case "bridePhoneNr":
                    System.out.println("Write new bride phone number: ");
                    jobs[id].bridePhoneNr = scan.nextInt();
                    break;
                case "exit":
                    a = -1;
                    break;
                default:
                    System.out.println("NO!");
                    break;
            }
        }

        //save changes to file
        System.out.println(SetRecords.saveData(jobs));


    }
}
