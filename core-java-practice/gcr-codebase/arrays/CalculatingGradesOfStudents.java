// This program calculate the Grades of the student after taking marks as input.
import java.util.Scanner;

public class CalculatingGradesOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input of total number of students by user
        int totalStudents = sc.nextInt();
        int[][] marks = new int[totalStudents][3]; //Storing marks of Physics,Chemistry and Maths for each student
        int[] percentages = new int[totalStudents]; //Stores percentage of each student
        char[] grades = new char[totalStudents]; // Stores grade of each student

        // taking input of marks for all student
        for (int iterator = 0; iterator < totalStudents; iterator++) {
            boolean flag = false;
            while (!flag) {
                System.out.println("Enter physics marks of " + (iterator + 1)+" the student");
                marks[iterator][0] = sc.nextInt();
                System.out.println("Enter chemistry marks of " + (iterator + 1)+" the student");
                marks[iterator][0] = sc.nextInt();
                System.out.println("Enter maths marks of " + (iterator + 1)+" the student");
                marks[iterator][0] = sc.nextInt();
                if(marks[iterator][0] >= 0 && marks[iterator][1] >= 0 && marks[iterator][2] >= 0) {
                    flag = true;
                }
                // If user enter the neagtive marks
                else{
                    System.out.println("Invalid input of marks marks cannot be negative");
                    iterator--;
                }
            }
        }

        // Calculating the percentage and the Grades of students
        for(int iterator = 0; iterator < totalStudents; iterator++) {
            percentages[iterator] = (marks[iterator][0] + marks[iterator][1] + marks[iterator][2]) / 3;
            if(percentages[iterator] >= 80) {
                grades[iterator] = 'A';
            }
            else if(percentages[iterator] >= 70) {
                grades[iterator] = 'B';
            }
            else if(percentages[iterator] >= 60) {
                grades[iterator] = 'C';
            }
            else if(percentages[iterator] >= 50) {
                grades[iterator] = 'D';
            }
            else if(percentages[iterator] >= 40) {
                grades[iterator] = 'E';
            }
            else{
                grades[iterator] = 'F';
            }
        }

        // Displaying the result of every student
        for(int i = 0; i < totalStudents; i++) {
            System.out.println("Student " + (i + 1) + " marks in physics is "+marks[i][0]+" and marks in chemistry is "+marks[i][1]+" marks in maths is "+marks[i][2]+" and\n percentage is "+percentages[i]+" and grade is" + grades[i]);
        }
    }
}
