package JSONHandling;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.ArrayList;

public class ConvertListOfJavaObjectToJSONArray {
    public static void main(String[] args) {
        // Object of ArrayList class
        ArrayList<Student> students = new ArrayList<>();

        // Objects of Student class
        students.add(new Student(1, "Rahul", 18));
        students.add(new Student(2, "Priya", 19));
        students.add(new Student(3, "Ankit", 18));
        students.add(new Student(4, "Sneha", 20));
        students.add(new Student(5, "Rohan", 18));
        students.add(new Student(6, "Neha", 19));
        students.add(new Student(7, "Vikas", 21));
        students.add(new Student(8, "Simran", 20));
        students.add(new Student(9, "Arjun", 22));
        students.add(new Student(10, "Kavya", 19));

        // Gson is used to convert Java Objects to JSON and JSON to java objects
        Gson gson = new Gson();

        String jsonObjects = gson.toJson(students);
        System.out.println(jsonObjects);
    }
}

// Student class
class Student{
    int rollNo;                                                             // Stores the roll number of Student
    String studentName;                                                     // Stores the name of student
    int studentAge;                                                         // Stores the age of student

    // Constructor of Student class
    public Student(int rollNo,String studentName,int studentAge){
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

}
