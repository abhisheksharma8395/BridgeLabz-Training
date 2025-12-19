// This program calculate the percentage of a student in examination
public class CalculatingPercentage {
    public static void main(String[] args) {
        // Marks in Maths , Physics , Chemistry , English , Computer
        double MathsMarks = 90;
        double PhysicsMarks = 91;
        double ChemistryMarks = 92;
        double EnglishMarks = 93;
        double ComputerMarks = 94;
        double Percentage = (MathsMarks + PhysicsMarks + ChemistryMarks + EnglishMarks + ComputerMarks) / 5;
        System.out.println(Percentage);
    }
}
