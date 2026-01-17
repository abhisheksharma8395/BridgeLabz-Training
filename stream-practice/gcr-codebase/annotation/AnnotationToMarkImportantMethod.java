package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class AnnotationToMarkImportantMethod {
    public static void main(String[] args) throws NoSuchMethodException {

        // Create the class object of Greet class
        Class<?> cls = Greet.class;

        // Retrieving the annotation of greetMorning method
        Method morning = cls.getDeclaredMethod("greetMorning");
        if(morning.isAnnotationPresent(ImportantMethod.class)){
            ImportantMethod annotation = morning.getAnnotation(ImportantMethod.class);
            System.out.println(morning.getName()+" -> "+annotation.level());
        }

        // Retrieving the annotation of greetEvening method
        Method evening = cls.getDeclaredMethod("greetEvening");
        if(evening.isAnnotationPresent(ImportantMethod.class)){
            ImportantMethod annotation = evening.getAnnotation(ImportantMethod.class);
            System.out.println(evening.getName()+" -> "+annotation.level());
        }
    }
}


// Greet class
class Greet{

    // This method is used to greet Morning
    @ImportantMethod(level = "Medium")
    public void greetMorning(){
        System.out.println("Good Morning");
    }

    // This method is used to greet Evening
    @ImportantMethod(level = "Low")
    public void greetEvening(){
        System.out.println("Good Evening");
    }
}


// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod{
    String level() default "HIGH";
}


