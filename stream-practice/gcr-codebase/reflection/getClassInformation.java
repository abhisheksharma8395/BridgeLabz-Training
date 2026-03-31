package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class getClassInformation {
    public static void main(String[] args) throws NoSuchMethodException {
        // Object of Scanner class
        Scanner scanner = new Scanner(System.in);
        // Taking input of class name from user
        System.out.println("Enter a class name e.g.(java.util.ArrayList) : ");
        String className = scanner.next();

        try{
            Class<?> cls = Class.forName(className);
            // Print the class details
            System.out.println("---------- Class Details ----------------");
            System.out.println("Class Name : "+ cls.getName());

            // Prints the Constructor details
            System.out.println("---------- Constructor Details ----------");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for(Constructor<?> constructor : constructors){
                System.out.println(constructor.toString());
            }

            // Prints the method name of the class
            System.out.println("--------- Method Details ----------------");
            Method[] methods = cls.getDeclaredMethods();
            for(Method method : methods){
                System.out.println(method.getName()+"()");
            }

            // Print the fields of class
            System.out.println("-------- Field Details ------------------");
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields){
                System.out.println(field.getName());
            }

        }catch(ClassNotFoundException e){
            System.out.println("Class with "+className+" not founds ");
        } catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
