public class GenerateArithmeticException {
    // This method is used to divide two numbers
    public int divide(int a,int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException();
        }
        return a/b;
    }
}
