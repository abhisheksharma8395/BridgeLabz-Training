package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class TodoAnnotationForPendingTask {
    public static void main(String[] args) {
        // Creating the class Object of TaskManagementSystem
        Class<?> cls = TaskManagementSystem.class;
        // Storing all methods of TaskManagementSystem
        Method[] methods = cls.getDeclaredMethods();
        for(Method method : methods){
            // Checking if annotation is present in the method or not
            if(method.isAnnotationPresent(Todo.class)) {
                // Creating the object of annotation at runtime
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Method Name : " + method.getName());
                System.out.println("Task : "+annotation.task());
                System.out.println("Assigned To : "+annotation.assignedTo());
                System.out.println("Priority : "+annotation.priority());
            }
            System.out.println("-------------------------------------------------");

        }
    }
}

class TaskManagementSystem{

    // Method doAssignment which handles the task of completing the assignment
    @Todo(task = "Complete the assigned task",assignedTo = "Saket Mishra",priority = "High")
    public void doAssignment(){
        System.out.println("Do the Assignment reggularly");
    }

    // Method updateReadme which handles the task of updating the Readme
    @Todo(task = "Update the README",assignedTo = "Abhishek Sharma",priority = "Low")
    public void updateReadme(){
        System.out.println("Update your Readme after every week.");
    }

    @Todo(task = "Solve 2 LeetCode Problems",assignedTo = "Shivam Gupta",priority = "Medium")
    public void doLeetcodeProblems(){
        System.out.println("Solve 2 LeetCode problems EveryDay");
    }
}


// Custom annotation Todo to mark pending features features in a project
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo{
    String task() default "Description of the task";
    String assignedTo() default "Developer responsible";
    String priority() default "MEDIUM";
}
