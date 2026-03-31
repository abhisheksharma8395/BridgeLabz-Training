package reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RetrieveAnnotationAtRuntime {
    // Main method
    public static void main(String[] args) {
        // Creating Class Object of Greet class
        Class<?> cls = Greet.class;
        // Checking if the annotation is present or not
        if(cls.isAnnotationPresent(Author.class)){
            // Creating the object of annotation at runtime
            Author author = cls.getAnnotation(Author.class);
            // Displaying the annotation value
            System.out.println(author.name());
        }
    }
}

// Greet class
@Author(name = "Hello My Name is Abhishek Sharma")
class Greet{
    // greeting method
    public void greeting(){
        System.out.println("Good Morning");
    }
}

// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)                  // Meta Annotations
@Target(ElementType.TYPE)                            // Meta Annotations
@interface Author{
    public String name() default "name = Author Name";
}