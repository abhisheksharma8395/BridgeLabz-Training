package csv_data_handling;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCSVDataBeforeProcessing {
    public static void main(String[] args) {
        // Storing the file location
        String filePath = "io-programming-practice/gcr-codebase/csv_data_handling/personDetails.csv";
        String regexEmail = "^[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$\n";
        String regexPhone = "(\\+91)?[6-9]{1}[0-9]{9}";
        Pattern emailPattern = Pattern.compile(regexEmail);
        Pattern phonePattern = Pattern.compile(regexPhone);
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line = reader.readLine();
            if(line == null){
                System.out.println("File is null currently");
                return;
            }
            int emailIndex = 0;
            int phoneIndex = 0;
            String[] header = line.split(",");
            for(int i = 0;i< header.length;i++){
                if(header[i].equals("Email")) emailIndex = i;
                if(header[i].equals("Phone Numbers")) phoneIndex = i;
            }

            int count = 1;
            while((line = reader.readLine())!=null){
                String[] column = line.split(",");
                if(column.length != header.length){
                    System.out.println("Partial record present in row number "+count);
                }
                else{
                    StringBuilder error = new StringBuilder();
                    Matcher emailMatcher = emailPattern.matcher(column[emailIndex]);
                    Matcher phoneMatcher = phonePattern.matcher(column[phoneIndex]);
                    if(!emailMatcher.matches()){
                        error.append("Email is not in correct format\n");
                    }
                    if(!phoneMatcher.matches()){
                        error.append("Phone Number is not correct");
                    }
                    if(!error.isEmpty()){
                        System.out.println("Records of Row"+count+" has error : "+error);
                    }
                }
                count++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
