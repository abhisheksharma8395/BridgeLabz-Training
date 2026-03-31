package collectors.student_result_grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Virat Kohli", "A+");
        Student student2 = new Student("Luka Modric", "B+");
        Student student3 = new Student("Sunil Chhetri", "B");
        Student student4 = new Student("Ravindra Jadeja", "C");

        Student student5 = new Student("Erling Haaland", "A+");
        Student student6 = new Student("Jasprit Bumrah", "A");
        Student student7 = new Student("Robert Lewandowski", "B+");
        Student student8 = new Student("Mohamed Salah", "B");
        Student student9 = new Student("Ben Stokes", "C");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);

        Map<String, List<String>> result = studentList.stream()
                .collect(Collectors.groupingBy(
                        (Student student) -> student.grades
                        ,Collectors.mapping(
                                (Student s) -> s.name, Collectors.toList()
                        )
                        )
                );
        for (String key : result.keySet()) {
            System.out.print(key + " = ");
            for (String name : result.get(key)) {
                System.out.print(name+" , ");
            }
        }
    }
}

