public class StudentsInfo {
   // Static variable UNIVERSITY_NAME shared across all instances
   private static String UNIVERSITY_NAME;
   private static int totalStudents = 0;                  // Stores the count of total student
   // Instance variables
   private final int rollNumber;                        // Final variable to ensure the roll number cannot be changed
   private String name;                                 // Stores the name of Student
   private char grade;                                  // Stores the grade of the student

   // Constructor of StudentsInfo class to initialize name, rollNumber, and grade
   public StudentsInfo(String name, int rollNumber, char grade) {
       this.name = name;
       this.rollNumber = rollNumber;
       this.grade = grade;
       totalStudents++;
   }

   // Static method to set the university name
   public static void setUniversityName(String name) {
       UNIVERSITY_NAME = name;
   }
   // Static method to display the total number of students enrolled
   public static void displayTotalStudents() {
       System.out.println("Total Students Enrolled: " + totalStudents);
   }
   // Method to display student details
   public void displayStudentDetails() {
       if (this instanceof StudentsInfo) {
           System.out.println("University Name: " + UNIVERSITY_NAME);
           System.out.println("Roll Number: " + rollNumber);
           System.out.println("Name: " + name);
           System.out.println("Grade: " + grade);
       } else {
           System.out.println("The object is not an instance of the Student class.");
       }
   }
   // Method to update the student's grade
   public void updateGrade(char newGrade) {
       if (this instanceof StudentsInfo) {
           this.grade = newGrade;
           System.out.println("Grade updated to: " + newGrade);
       } else {
           System.out.println("The object is not an instance of the Student class.");
       }
   }

   // Getters method for instance variables like name , rollNumber and grade
   public String getName() {
       return name;
   }
   public int getRollNumber() {
       return rollNumber;
   }
   public char getGrade() {
       return grade;
   }

   // Main method to test the program
   public static void main(String[] args) {
       // Set the university name (static variable)
       StudentsInfo.setUniversityName("Global University");
       // Create new StudentsInfo class instances
       StudentsInfo student1 = new StudentsInfo("Hemashree", 101, 'A');
       StudentsInfo student2 = new StudentsInfo("Sharmila", 102, 'B');

       // Display total number of students enrolled
       StudentsInfo.displayTotalStudents();
       // Display student details
       student1.displayStudentDetails();
       System.out.println();
       student2.displayStudentDetails();
       // Update student grade
       student2.updateGrade('A');
       System.out.println();
       // Display updated student details
       student2.displayStudentDetails();
   }
}
