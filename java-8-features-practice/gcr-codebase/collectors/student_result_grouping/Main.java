package collectors.student_result_grouping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class











































































































































bappe", "A+");
        Student student12 = new Student("Jasprit Bumrah", "A");
        Student student13 = new Student("Luka Modric", "B+");
        Student student14 = new Student("Sunil Chhetri", "B");
        Student student15 = new Student("Ravindra Jadeja", "C");

        Student student16 = new Student("Erling Haaland", "A+");
        Student student17 = new Student("Babar Azam", "A");
        Student student18 = new Student("Robert Lewandowski", "B+");
        Student student19 = new Student("Mohamed Salah", "B");
        Student student20 = new Student("Ben Stokes", "C");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        studentList.add(student11);
        studentList.add(student12);
        studentList.add(student13);
        studentList.add(student14);
        studentList.add(student15);
        studentList.add(student16);
        studentList.add(student17);
        studentList.add(student18);
        studentList.add(student19);
        studentList.add(student20);

        Map<String,List<String>> result = studentList.stream().collect(Collectors.groupingBy((Student student) -> student.grades , Collectors.mapping((Student student) -> student.grades,Collectors.toList())));
        for(String key : result.keySet()){
            System.out.print(key+" = ");
            for(String name : result.get(key)){
                System.out.print(name);
            }
        }
    }
}
