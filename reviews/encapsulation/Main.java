package encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student(1,"abc");
        Student student2 = new Student(2,"def");
        Student student3 = new Student(3,"ghi");
        Student student4 = new Student(4,"jkl");
        Student student5 = new Student(5,"xyz");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        for(Student student : studentList){
            System.out.println(" Student Id -> "+student.getStudentId());
            System.out.println(" Student Name -> "+student.getStudentName());
        }

        student3.setStudentName("Abhishek");
        student3.setStudentIs(7);

        System.out.println(" ===================================================");

        for(Student student : studentList){
            System.out.println(" Student Id -> "+student.getStudentId());
            System.out.println(" Student Name -> "+student.getStudentName());
        }
    }
}
