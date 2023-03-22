import java.io.*;
import java.util.Scanner;

public class SetRecords {
    public static void main() throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder job = new StringBuilder();

        int choice = 0;

        while (choice != 1){

                System.out.print("Inset date: ");
                job.append(scan.nextLine() + "%");

                System.out.print("Inset names: ");
                job.append(scan.nextLine() + "%");

            System.out.print("Inset location: ");
            job.append(scan.nextLine() + "%");

            System.out.print("Inset Bride and groom number: \n");
                System.out.print("Groom nr: ");
                job.append(scan.nextLine() + "%");

                System.out.print("Bride nr: ");
                job.append(scan.nextLine() + "%!");

            BufferedWriter bw = null;

            try{
                bw = new BufferedWriter(new FileWriter(Main.path + "\\data.txt", true));
                bw.write(job.toString());
                bw.newLine();

            } catch (Exception e){
                System.out.println("file not found");
                e.printStackTrace();
            } finally {
                bw.close();
            }

            System.out.println("Add another object? Y/N");
            char option = scan.next().toUpperCase().charAt(0);
            switch (option) {
                case 'N':
                    choice = 1;
                    break;
                case 'Y':
                    continue;
                default:
                System.out.println("Not Y or N, try again");
            }
        }

    }

    public static String saveData(Job[] jobs) throws IOException{


        for (int i = 0; i < jobs.length; i++) {

            BufferedWriter bw = null;
            StringBuilder job = new StringBuilder();

            //create 'line' of data to save
            job.append(jobs[i].date + "%");

            job.append(jobs[i].names + "%");

            job.append(jobs[i].location + "%");

            job.append(jobs[i].groomPhoneNr + "%");

            job.append(jobs[i].bridePhoneNr + "%!");

            //save data to file
            //if first line -> don't append to existing file, overwrite it
            if (i == 0) {
                try {
                    bw = new BufferedWriter(new FileWriter(Main.path + "\\data.txt"));
                    bw.write(job.toString());
                    bw.newLine();

                } catch (Exception e) {
                    System.out.println("file not found");
                    e.printStackTrace();
                } finally {
                    bw.close();
                }
            }

            //if any other line -> append to existing line
            else {
                try {
                    bw = new BufferedWriter(new FileWriter(Main.path + "\\data.txt", true));
                    bw.write(job.toString());
                    bw.newLine();

                } catch (Exception e) {
                    System.out.println("file not found");
                    e.printStackTrace();
                } finally {
                    bw.close();
                }
            }
        }

        return "git";
    }
}
