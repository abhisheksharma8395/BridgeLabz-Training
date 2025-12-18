//This Programme calculates Harry's age in 2024 given his birth year is 2000.

public class HarryAge {
    
    //Main Method
    public static void main(String[] args) {

        // Given data
        int BirthYear = 2000;
        int RunningYear = 2024;
        
        // Calculate age
        int age = RunningYear - BirthYear;
        
        // Printings the result
        System.out.println("Harry's age in 2024 is " + age);
    }
}