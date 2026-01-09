import java.util.ArrayList;
import java.util.List;

public class StudentGradingSystem {
    public static void main(String[] args) {
        // Creating objects of StudentInfo class
        StudentInfo student1 = new StudentInfo("Abhishek Sharma","STD101",new int[]{58,45,62,55,53});
        StudentInfo student2 = new StudentInfo("Saket Mishra","STD102",new int[]{98,89,96,95,83});
        StudentInfo student3 = new StudentInfo("Aditya Raj","STD103",new int[]{88,85,82,95,83});
        StudentInfo student4 = new StudentInfo("Virat Kohli","STD104",new int[]{98,95,94,98,99});
        StudentInfo student5 = new StudentInfo("Rohit Sharma","STD105",new int[]{90,91,97,85,92});
        StudentInfo student6 = new StudentInfo("Mahendra Singh Dhoni","STD106",new int[]{88,90,98,89,97});
        StudentInfo student7 = new StudentInfo("Jaspreet Bumrah","STD107",new int[]{90,91,90,96,93});
        StudentInfo student8 = new StudentInfo("Travis Head","STD108",new int[]{85,90,72,85,73});
        StudentInfo student9 = new StudentInfo("Joe Root","STD109",new int[]{98,95,62,75,53});
        StudentInfo student10 = new StudentInfo("Subhman Gill","STD110",new int[]{68,76,83,59,71});

        // Creating object of StudentGradeManager class
        StudentGradeManager studentGradeManager = new StudentGradeManager();
        // Adding student by using addStudent method of StudentGradeManager class
        studentGradeManager.addStudent(student1);
        studentGradeManager.addStudent(student2);
        studentGradeManager.addStudent(student3);
        studentGradeManager.addStudent(student4);
        studentGradeManager.addStudent(student5);
        studentGradeManager.addStudent(student6);
        studentGradeManager.addStudent(student7);
        studentGradeManager.addStudent(student8);
        studentGradeManager.addStudent(student9);
        studentGradeManager.addStudent(student10);

        // Displaying output of different-different methods of class studentGradeManager
        studentGradeManager.highestMarkInSubject();
        studentGradeManager.averageAndTotal();
        studentGradeManager.averageMarks();
    }
}

// class StudentGradeManager class

class StudentGradeManager {
    List<StudentInfo> students;                                 // Stores the information of all the student
    String[] subjects = new String[]{"Physics","Chemistry","Mathematics","English","Computer Science"};

    // Constructor of StudentGradeManager class
    public StudentGradeManager() {
        students = new ArrayList<>();
    }

    // This method is used to add student into list
    public void addStudent(StudentInfo student) {
        students.add(student);
    }

    // This method is used to remove student from the list
    public void removeStudent(StudentInfo student) {
        students.remove(student);
    }

    // This method is used to display the Total and Average marks of all student
    public void averageAndTotal() {
        for(StudentInfo studentInfo : students) {
            studentInfo.display();
        }
    }

    // This method is used to Display the Highest marks in each subject
    public void highestMarkInSubject(){
        System.out.println("________________________________________________________");
        for(int i = 0 ; i<this.subjects.length;i++){
            int highestMark = 0;
            for(StudentInfo studentInfo : students){
                if(highestMark < studentInfo.marks[i]){
                    highestMark = studentInfo.marks[i];
                }
            }
            System.out.println("Highest Marks in "+this.subjects[i]+" is : "+highestMark);
        }
        System.out.println("________________________________________________________");
    }

    // This method is used to Display the Average of all student
    public void averageMarks(){
        System.out.println("________________________________________________________");
        double averageMark = 0;
        for(int i = 0 ; i<this.subjects.length;i++){
            for(StudentInfo studentInfo : students){
                averageMark += studentInfo.averageMarks();
            }
            averageMark = averageMark/this.students.size();
        }
        System.out.printf("Average Marks of class is : %.2f\n",averageMark);
        System.out.println("________________________________________________________");
    }

}


// StudentInfo class
class StudentInfo{
    String studentName;                                // Stores the name of student
    String studentID;                                 //  Stores the id of the student
    int[] marks;                                       // Stores the marks of student

    // Constructor of StudentInfo class
    public StudentInfo(String studentName, String studentID, int[] marks) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.marks = marks;
    }

    // This method is used to calculate the total marks of the student
    public int totalMarks() {
        int total = 0;
        for(int mark : marks) {
            total += mark;
        }
        return total;
    }

    // This method is used to calculate the average marks of the student
    public double averageMarks() {
        int total = this.totalMarks();
        return (double)total/(double)marks.length;
    }

    // This method is used to display the information of the student
    public void display() {
        System.out.println("________________________________________________________");
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Total Marks: " + this.totalMarks());
        System.out.println("Average Marks: " + this.averageMarks());
        System.out.println("________________________________________________________");
    }
}
