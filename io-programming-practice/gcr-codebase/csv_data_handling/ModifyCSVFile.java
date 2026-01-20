package csv_data_handling;

import java.io.*;

public class ModifyCSVFile {
    public static void main(String[] args) {
        String filePath = "io-programming-practice/gcr-codebase/csv_data_handling/employeeDetails.csv";
        String newFilePath = "io-programming-practice/gcr-codebase/csv_data_handling/updatedSalaryIT.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath)); BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFilePath))){
            String line = bufferedReader.readLine();
            bufferedWriter.write(line);
            bufferedWriter.write("\n");
            while((line = bufferedReader.readLine())!=null){
                String[] column = line.split(",");
                if(column[2].equals("IT")){
                    int salary = Integer.parseInt(column[3]) + (Integer.parseInt(column[3]))/10;
                    bufferedWriter.write(column[0]+","+column[1]+","+column[2]+","+String.valueOf(salary));
                    bufferedWriter.write("\n");
                }

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
