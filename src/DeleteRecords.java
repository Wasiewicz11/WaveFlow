import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeleteRecords {
    public static void Delete() throws IOException {
        //show projects that already exists
        ShowRecords.show();
        Job[] jobs = ShowRecords.readData();

        //chose project to delete
        Scanner scan = new Scanner(System.in);
        System.out.println("Write number of project which you want to delete");
        byte id = scan.nextByte();
        System.out.println("Are you sure to delete project nr. " + id + "? (Y/N)");
        char confirm = scan.next().charAt(0);
        id--;


        if (confirm == 'Y'){

            //delete project
            Job[] newJobs = new Job[jobs.length - 1];

            int newIndex = 0;
            for (int i = 0; i < jobs.length; i++) {
                if (i != id) {
                    newJobs[newIndex] = jobs[i];
                    newIndex++;
                }
            }

            jobs = newJobs;

            System.out.println(SetRecords.saveData(jobs));

        } else if (confirm == 'N'){
        } else {
            System.out.println("Wrong character");
        }
    }
}
