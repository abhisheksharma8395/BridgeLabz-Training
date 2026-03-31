// This program print the grade of the student after taking the marks of student as input.

import java.util.Scanner;

public class GradesAccordingToMarks {
    // Main method
    public static void main(String[] args) {
        // Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking the input of marks between 1 and 100
        System.out.println("Enter the grades between 1 and 100 : ");
        int marks = sc.nextInt();
        // checking if the user gives the input between 0 and 100
        if (marks >= 0 && marks <= 100) {
            // Printing Grades according to marks of student by using if-else statement
            if (marks > 90) {
                System.out.println("Excellent");
            } else if (marks > 80) {
                System.out.println("Very Good");
            } else if (marks > 70) {
                System.out.println("Good");
            } else if (marks > 60) {
                System.out.println("Can do better");
            } else if (marks > 50) {
                System.out.println("Average");
            } else if (marks > 40) {
                System.out.println("Below Average");
            } else {
                System.out.println("Fail");
            }
        }
        // if user enters the negative number
        else{
            System.out.println("Invalid input! Please enter the mark between 0 and 100 : ");
        }
    }
}
