package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokePrivateMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Creating the object of Calculator class
        Calculator calculator = new Calculator();
        // Class Object
        Class<?> cls = calculator.getClass();
        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
        // Creating accessible multiply method
        method.setAccessible(true);
        int result = (int)method.invoke(calculator,5,10);
        System.out.println("The Result of Multiplication of 5 and 10 is : "+result);
    }
}

// Calculator class
class Calculator{
    // Private method multiply of Calculator class
    private int multiply(int a,int b){
        return (a*b);
    }
}
