package csv_data_handling;

import java.io.*;
import java.util.HashMap;



public class MergeTwoCSV {
    public static void main(String[] args) {
        // Storing the file location
        String students1Path = "io-programming-practice/gcr-codebase/csv_data_handling/students1.csv";
        String students2Path = "io-programming-practice/gcr-codebase/csv_data_handling/students2.csv";
        String students3Path = "io-programming-practice/gcr-codebase/csv_data_handling/students3.csv";
        try (BufferedReader reader1 = new BufferedReader(new FileReader(students1Path)); BufferedReader reader2 = new BufferedReader(new FileReader(students2Path)); BufferedWriter writer = new BufferedWriter(new FileWriter(students3Path))) {
            String line1 = reader1.readLine();
            if (line1 == null) {
                System.out.println("students1 is null currently");
                return;
            }
            // This map stores the id as key and Name and Age as value
            HashMap<Integer, String[]> map = new HashMap<>();
            while ((line1 = reader1.readLine()) != null) {
                String[] column = line1.split(",");
                map.put(Integer.parseInt(column[0]),new String[]{column[1],column[2]});
            }

            String line2 = reader2.readLine();
            writer.write("ID,Name,Age,Marks,Grade\n");
            if (line2 == null) {
                System.out.println("students2 is null currently");
                return;
            }
            while ((line2 = reader2.readLine()) != null) {
                String[] column = line2.split(",");
                if(map.containsKey(Integer.parseInt(column[0]))){
                    String name = map.get(Integer.parseInt(column[0]))[0];
                    String age = map.get(Integer.parseInt(column[0]))[1];
                    writer.write(column[0]+","+name+","+age+","+column[1]+","+column[2]+"\n");
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
