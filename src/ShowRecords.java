import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ShowRecords {
    public static void show() {
        System.out.println("You current projects in database: ");

        Job[] jobs = readData();

        byte c = 0;
        for (Job job : jobs) {
            System.out.println("PROJECT NR: " + ++c);
            System.out.println(job.toString());
        }

        System.out.println("Number of projects: " + jobs.length + "\n");
    }
    public static Job[] readData(){
        BufferedReader br = null;
        List<String> list = new LinkedList<String>();
        List<Job> jobList = new ArrayList<Job>();
        StringBuilder sb = new StringBuilder();


        try {
            String str = "";
            br = new BufferedReader(new FileReader(Main.path + "\\data.txt"));
            Job job;

            while ((str = br.readLine()) != null){

                //iterate trough readed line
                for (int i = 0; i < str.length(); i++){
                    if (str.charAt(i) != '%'){
                        sb.append(str.charAt(i));
                    } else {
                        list.add(sb.toString());
                        sb.setLength(0);
                    }
                }
                sb.setLength(0);

                //save data to job
                job = new Job(list.get(0), list.get(1), list.get(2), Integer.parseInt(list.get(3)), Integer.parseInt(list.get(4)));
                jobList.add(job);

                list.clear();
            }

        }catch (EOFException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

        Job[] jobs = new Job[jobList.size()];
        jobList.toArray(jobs);

        return jobs;
    }
}
