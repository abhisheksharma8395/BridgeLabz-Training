package json_handling;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJSONFile {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String filePath = "io-programming-practice/gcr-codebase/JSONHandling/data.json";
        try(FileReader fileReader = new FileReader(filePath)){
            User user = gson.fromJson(fileReader, User.class);
            System.out.println("Name : "+user.name);
            System.out.println("Email : "+user.email);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class User{
    String name;
    String email;
}
