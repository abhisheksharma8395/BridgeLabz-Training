package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingCSVFile {
    public static void main(String[] args) {
        String filePath = "io-programming-practice/gcr-codebase/csv_data_handling/studentDetails.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            // To skip the header
            String line = bufferedReader.readLine();
            while((line = bufferedReader.readLine())!=null){
                String[] columns = line.split(",");
                System.out.println("ID : "+columns[0]+", Name : "+columns[1]+", Age : "+columns[2]+", Marks : "+columns[3]);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
