package JSONHandling;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.FileWriter;

public class MergeTwoJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        // Storing the path of Json1 and Json2
        String json1Path = "io-programming-practice/gcr-codebase/JSONHandling/Json1.json";
        String json2Path = "io-programming-practice/gcr-codebase/JSONHandling/Json2.json";

        try(FileReader reader1 = new FileReader(json1Path);
            FileReader reader2 = new FileReader(json2Path)){

            // Create instance of JsonObject and putting the JSON Object in it from file Json1 and Json2
            JsonObject obj1 = JsonParser.parseReader(reader1).getAsJsonObject();
            JsonObject obj2 = JsonParser.parseReader(reader2).getAsJsonObject();
            // Putting the data of obj2 in obj1
            for(String key : obj2.keySet()){
                obj1.add(key,obj2.get(key));
            }

            // Printing the obj1 in JSON
            System.out.println(obj1.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
