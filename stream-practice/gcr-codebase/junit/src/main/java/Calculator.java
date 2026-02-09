public class Calculator {
    // This method is used to return the sum of two numbers
    public int add(int a, int b) {
        return a + b;
    }
    // This method is used to return the subtraction of two numbers
    public int subtract(int a, int b) {
        return a - b;
    }
    // This method is used to return the multiplication of two numbers
    public int multiply(int a, int b) {
        return a * b;
    }
    // This method is used to return the division of two numbers
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero not allowed");
        return a / b;
    }
}
