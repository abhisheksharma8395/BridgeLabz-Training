package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchForRecord {
    public static void main(String[] args) {
        String name = "Abhishek Sharma";
        boolean flag = false;
        String filePath = "io-programming-practice/gcr-codebase/csv_data_handling/employeeDetails.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String line = bufferedReader.readLine();
            while((line = bufferedReader.readLine())!=null){
                String[] column = line.split(",");
                if(column[1].equals(name)) {
                    System.out.println("Department : " + column[2] + ", Salary : " + column[3]);
                    flag = true;
                }
            }
            if(!flag) System.out.println("No record found with employee name "+name);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
