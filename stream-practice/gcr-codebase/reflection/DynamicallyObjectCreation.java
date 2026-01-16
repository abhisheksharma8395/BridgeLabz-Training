package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DynamicallyObjectCreation {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> cls = Student.class;
        Constructor<?> constructor = cls.getConstructor(String.class,String.class);
        Student student = (Student) constructor.newInstance("Abhishek","123456");
        System.out.println(student);
    }
}

// Student class
class Student{
    String name;                                       // Stores the name of Student
    String rollNo;                                     // Stores the rollNo of Student

    // Constructor of Student class to initialize instance variable
    public Student(String name,String rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    // toString method of Student class
    @Override
    public String toString(){
        return ("Student with name "+this.name+" and with rollNo "+this.rollNo);
    }
}
