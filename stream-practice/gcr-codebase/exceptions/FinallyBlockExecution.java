package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockExecution{
    public static void main(String[] args){
        integerDivision();
    }

    // This method is used to Handle ArithmeticException and InputMismatchException
    public static void integerDivision (){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Please enter numerator : ");
            int numerator = sc.nextInt();
            System.out.println("Please enter denominator : ");
            int denominator = sc.nextInt();
            int result = numerator/denominator;
            System.out.printf("Result of %d divided by %d is equals to : %d\n",numerator,denominator,result);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurred Might be you Enter denominator value to 0");
        }
        finally{
            System.out.println("Operation Completed");
        }
    }
}