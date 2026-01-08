import java.util.Scanner;

public class CustomException{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the Age of user : ");
            int age = sc.nextInt();
            validateAge(age);
        }catch (InvalidAgeException e){
            System.out.println("Age must be 18 or above.");
        }
    }

    // This method is checks the age of user and throw InValidAgeException
    public static void validateAge (int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Invalid age");
        }
        System.out.println("Access granted!");
    }
}
// Custom Exception class : InvalidAge
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}