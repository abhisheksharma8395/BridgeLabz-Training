package csv_data_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataToCSV {
    public static void main(String[] args) {
        String filePath = "io-programming-practice/gcr-codebase/csv_data_handling/employeeDetails.csv";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            writer.write("ID,Name,Department,Salary\n");
            writer.write("104,Abhishek Sharma,Development,5000000\n");
            writer.write("105,Virat Kohli,Testing,4500000\n");
            writer.write("106,Rohit Sharma,Human Resource,1900000\n");
            writer.write("107,Mahendra Singh Dhoni,Sales,245000\n");
            writer.write("108,Smriti Mandhana,IT,1900000\n");
            writer.write("109,Jasprit Bumrah,Development,3800000\n");
            writer.write("110,KL Rahul,Marketing,2600000\n");
            writer.write("111,Hardik Pandya,Sales,1750000\n");
            writer.write("112,Shubman Gill,Testing,2200000\n");
            writer.write("113,Richa Ghosh,Human Resource,1500000\n");
            writer.write("114,Deepti Sharma,IT,2100000\n");
            writer.write("115,Ravindra Jadeja,Finance,3000000\n");
            writer.write("116,Suryakumar Yadav,Development,3400000\n");
            writer.write("117,Bhuvneshwar Kumar,Support,1800000\n");
            writer.write("118,Harmanpreet Kaur,Management,4200000\n");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
