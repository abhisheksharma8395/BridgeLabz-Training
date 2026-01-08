public class ExceptionPropagationInMethods{
    public static void main(String[] args){
        try{
           method2();
        }catch(ArithmeticException e){
            System.out.println("Handled Exception in main");             // Handling Arithmetic Exception in main method
        }
    }

    // This method throws ArithmeticException
    public static int method1() throws ArithmeticException{
        return 10/0 ;
    }

    // This method throws ArithmeticException
    public static int method2() throws ArithmeticException{
        return method1() ;
    }
}
