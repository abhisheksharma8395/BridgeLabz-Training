package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class LoggingMethodExecutionTime {
    public static void main(String[] args) throws NoSuchMethodException {
        // Object of Service class
        Service service = new Service();
        // Creating Method object class
        Method method = service.getClass().getMethod("processData");

        // Checking is Annotation present or not in method
        if(method.isAnnotationPresent(LogExecutionTime.class)){
            // Creating the instance of LogExecutionTime at runtime
            LogExecutionTime annotation = method.getAnnotation(LogExecutionTime.class);
            long startTime = System.nanoTime();
            // Calling the method processData of Service class
            service.processData();
            long endTime = System.nanoTime();
            // Printing the result
            System.out.println(annotation.message()+((endTime-startTime)/1e6)+"ms");
        }
    }

}


// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)       // Meta Annotations
@Target(ElementType.METHOD)               // Meta Annotations
@interface LogExecutionTime{
    // message method
    String message() default "Method Executed in:";
}

// Class Service
class Service{
    // Using Custom Annotations
    @LogExecutionTime(message = "Time Taken : ")
    public void processData(){
        System.out.println("Processing Data.....");
        for(int i = 0;i<100000;i++){
            i++;
        }
    }
}
