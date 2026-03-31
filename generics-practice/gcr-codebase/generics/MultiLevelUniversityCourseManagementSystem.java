import java.util.ArrayList;
import java.util.List;


public class MultiLevelUniversityCourseManagementSystem {
    public static void main(String[] args) {

        // Creating the objects of ExamCourse , AssignmentCourse , ResearchCourse classes.
        ExamCourse examCourse1 = new ExamCourse("Basic Electrical Engineering",3);
        ExamCourse examCourse2 = new ExamCourse("Engineering Physics",4);
        AssignmentCourse assignmentCourse = new AssignmentCourse("Major Project Final Year",10);
        ResearchCourse researchCourse = new ResearchCourse("Field Project",5);

        // Creating the object of Course class
        Course<CourseType> courses = new Course<>();
        // Adding the courses by using addCourse method
        courses.addCourse(examCourse1);
        courses.addCourse(examCourse2);
        courses.addCourse(assignmentCourse);
        courses.addCourse(researchCourse);

        // Removing the Course by using removeCourse
        courses.removeCourse(examCourse1);

        // Displaying the courses
        courses.displayCourse();
    }
}

// Abstract class CourseType
abstract class CourseType{
    private String courseName;                                               // Stores the course name
    private int credits;                                                     // Stores the credits
    // Constructor of abstract class CourseType to initialize instance variables
    public CourseType(String courseName, int credits){
        this.courseName = courseName;
        this.credits = credits;
    }

    public abstract void evaluate();            // Abstract method evaluate

    // Getter And Setter Method to get and set the value of courseName and credits.
    public String getCourseName() {
        return courseName;
    }
    public int getCredits() {
        return credits;
    }
}

// Subclass ExamCourse Extending the Abstract class CourseType
class ExamCourse extends  CourseType{

    // Constructor of class ExamCourse to initialize instance variables
    public ExamCourse(String courseName, int credits){
        super(courseName, credits);
    }

    // Overriding the abstract method evaluate of class CourseType
    @Override
    public void evaluate(){
        System.out.println("This Course type Evaluates on Exam-Based.");
    }
}

// Subclass AssignmentCourse Extending the Abstract class CourseType
class AssignmentCourse extends CourseType{
    // Constructor of class AssignmentCourse to initialize instance variables
    public AssignmentCourse(String courseName, int credits){
        super(courseName, credits);
    }

    // Overriding the abstract method evaluate of class CourseType
    @Override
    public void evaluate(){
        System.out.println("This Course type Evaluates on Assignment-Based.");
    }
}

// Subclass ResearchCourse Extending the Abstract class CourseType
class ResearchCourse extends CourseType{
    // Constructor of class ResearchCourse to initialize instance variables
    public ResearchCourse(String courseName, int credits){
        super(courseName, credits);
    }

    // Overriding the abstract method evaluate of class CourseType
    @Override
    public void evaluate(){
        System.out.println("This Course type Evaluates on Research-Based.");
    }
}

class Course<T extends CourseType>{
    List<T> courses;                                   // Store the list of courses

    // Constructor of Course Class
    public Course(){
        this.courses = new ArrayList<>();
    }

    // This method is used to add Course in the list
    public void addCourse(T course){
        courses.add(course);
    }

    // This Method is used to remove the Course from the list
    public void removeCourse(T course){
        courses.remove(course);
    }

    // This Method also

    // This method is used to display the all courses in list
    public void displayCourse(){
        for(T course:courses){
            System.out.println("Course Name : "+course.getCourseName());
            System.out.println("Course Credits : "+course.getCredits());
            course.evaluate();
        }
    }

}

class CourseUtils{
    public static void display(List<? extends CourseType> courses){
        for(CourseType course:courses){
            System.out.println("Course Name : "+course.getCourseName());
            System.out.println("Course Credits : "+course.getCredits());
            course.evaluate();
        }
    }
}

