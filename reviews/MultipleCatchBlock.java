import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the first number");
            int a  = sc.nextInt();
            System.out.println("Enter the Second number ");
            int b  = sc.nextInt();
            int c = a/b;
        }catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
        catch(ArithmeticException e){
            System.out.println("Some Arithmetic Exception Occured");
        }
    }
}




