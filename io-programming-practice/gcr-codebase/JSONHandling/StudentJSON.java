package JSONHandling;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
public class StudentJSON {
    public static void main(String[] args) {
        // Created object of JsonObject to create JSON Object
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name","Abhishek Sharma");
        jsonObject.addProperty("age","21");

        // Created object of JsonArray to create JsonArray Object
        JsonArray jsonArray = new JsonArray();
        jsonArray.add("Physics");
        jsonArray.add("Chemistry");
        jsonArray.add("Mathematics");
        jsonArray.add("English");
        jsonArray.add("Computer Science");

        jsonObject.add("Subjects", jsonArray);
        System.out.println(jsonObject.toString());
    }
}
