package collectors.student_result_grouping;

public class Student {
    String name;                                     // Stores the name of the student
    String grades;                                   // Stores the grades of the student

    // Constructor of Student class to initialize the instance variable
    public Student(String name, String grades){
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString(){
        return "Name : "+this.name+", Grades : "+this.grades;
    }
}
