package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class CustomAnnotation {
    // Main method
    public static void main(String[] args) throws NoSuchMethodException {
        // Creating the Class Object of TaskManager
        Class<?> cls = TaskManager.class;

        // Creating instance of the method at RunTime
        Method method = cls.getDeclaredMethod("completeTask");
        // Checking if the annotation is present in the method or not
        if(method.isAnnotationPresent(TaskInfo.class)){
            // Creating the object or the instance of TaskInfo at the runtime
            TaskInfo object = method.getAnnotation(TaskInfo.class);
            System.out.println("Priority : "+object.priority());
            System.out.println("Assigned To : "+object.assignedTo());
        }

    }
}

// Creating the TaskManager class
class TaskManager{
    // Method completeTask
    @TaskInfo(priority = "High",assignedTo = "Abhishek Sharma")
    public void completeTask(){
        System.out.println("Task Completed");
    }
}


// Creating the custom Annotations
@Retention(RetentionPolicy.RUNTIME)                    // Meta Annotations
@Target(ElementType.METHOD)                            // Meta Annotations

// Custom Annotation designed by using interface keyword
@interface TaskInfo{
    // Fields of custom Annotations
    String priority() default "Priority is 0";
    String assignedTo() default "Assigned To No one";
}