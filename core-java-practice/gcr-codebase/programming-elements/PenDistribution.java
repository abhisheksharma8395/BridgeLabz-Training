//This Programme calculates how many pens each student gets when divided equally and finds how much pen were not distributed .
public class PenDistribution {

    //Main Method
    public static void main(String[] args) {

        // 14 pens are there for distribution
        int totalPens = 14;

        // 3 Total Student are there
        int numberOfStudents = 3;

        // Calculating pens per student so that pens can distributed equally in students
        int pensPerStudent = totalPens / numberOfStudents;
        
        // Calculating pens that were not distributed or remaining pens
        int remainingPens = totalPens % numberOfStudents;

        // Printings the result
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                         " and the remaining pen not distributed is " + remainingPens);
    }
}