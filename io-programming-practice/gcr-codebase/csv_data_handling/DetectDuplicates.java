package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class DetectDuplicates {
    public static void main(String[] args) {
        String filePath = "io-programming-practice/gcr-codebase/csv_data_handling/sample_duplicates.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            // To skip the header
            String line = bufferedReader.readLine();
            HashMap<String,Integer> map = new HashMap<>();
            System.out.println("Repeated Data : ");
            while((line = bufferedReader.readLine())!=null){
                String[] columns = line.split(",");
                if(map.get(columns[0]) != null && map.get(columns[0]) == 1){
                    System.out.println("ID : "+columns[0]+", Name : "+columns[1]+", Score : "+columns[2]);
                }
                map.put(columns[0],map.getOrDefault(columns[0],0)+1);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
