package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterRecords {
    public static void main(String[] args) {
        // File path
        String filePath = "io-programming-practice/gcr-codebase/csv_data_handling/studentDetails.csv";
        // Using try-with-resource to automatically close the resource
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String line = bufferedReader.readLine();
            while((line = bufferedReader.readLine())!=null){
                String[] column = line.split(",");
                if(Integer.parseInt(column[3]) > 80) {
                    System.out.println("ID : " + column[0] + ", Name : " + column[1] + ", Age : " + column[2] + ", Marks : " + column[3]);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
