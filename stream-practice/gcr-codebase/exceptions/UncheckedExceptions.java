package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptions{
    public static void main(String[] args){
        division();
    }

    // This method is used to Handle ArithmeticException and InputMismatchException
    public static void division (){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Please enter numerator : ");
            int numerator = sc.nextInt();
            System.out.println("Please enter denominator : ");
            int denominator = sc.nextInt();
            int result = numerator/denominator;
            System.out.printf("Result of %d divided by %d is equals to : %d",numerator,denominator,result);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurred Might be you Enter denominator value to 0");
        }catch(InputMismatchException e){
            System.out.println("InputMismatchException Occurred Might be you Enter value apart from integer");
        }
    }
}