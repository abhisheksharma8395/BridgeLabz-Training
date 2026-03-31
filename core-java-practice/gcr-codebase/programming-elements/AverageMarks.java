//This programme calculates average marks of Sam in Physics, Chemistry, and Maths.

public class AverageMarks {

    //Main method
    public static void main(String[] args) {
        
        // Sam's Marks in Maths
        int mathsMarks = 94;

        // Sam's Marks in Physics
        int physicsMarks = 95;
         
        // Sam's Marks in Chemistry
        int chemistryMarks = 96;
        
        // Calculating average marks of Sam in all three subject
        double averageMarks = (mathsMarks + physicsMarks + chemistryMarks) / 3.0;
        
        // Printing the result
        System.out.println("Sam's average mark in PCM is " + averageMarks);
    }
}