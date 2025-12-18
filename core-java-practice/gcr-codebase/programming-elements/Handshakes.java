import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {

        // creating the object of Scanner class
        Scanner scanner = new Scanner(System.in);

        //Taking input from user for total number of Students
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        // Calculating total number of handshakes between students
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // printing the result
        System.out.println("The maximum number of possible handshakes is: " + handshakes);
    }
}