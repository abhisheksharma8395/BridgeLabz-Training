package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Object of Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Method name (e.g. add,subtract,multiply)");
        String input = scanner.next();

        // Creating the object of Calculator class
        MathOperations operations = new MathOperations();

        // Class Object
        Class<?> cls = operations.getClass();
        Method method = cls.getDeclaredMethod(input, int.class, int.class);
        // Creating accessible multiply method
        method.setAccessible(true);
        int result = (int)method.invoke(operations,5,10);
        System.out.println("The Result of "+input+" of 5 and 10 is : "+result);
    }
}

// MathOperations class
class MathOperations{

    // Private method add of MathOperations class
    private int add(int a,int b){
        return (a+b);
    }

    // Private method subtract of MathOperations class
    private int subtract(int a,int b){
        return (a-b);
    }

    // Private method multiply of MathOperations class
    private int multiply(int a,int b){
        return (a*b);
    }
}