package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndCountRows {
    public static void main(String[] args) {
        int count = 0;
        String filePath = "io-programming-practice/gcr-codebase/csv_data_handling/employeeDetails.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String line = bufferedReader.readLine();
            while((line = bufferedReader.readLine())!=null){
                String[] column = line.split(",");
                count++;
                System.out.println("ID : "+column[0]+", Name : "+column[1]+", Department : "+column[2]+", Salary : "+column[3]);
            }
            System.out.println("Total rows are "+count);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
