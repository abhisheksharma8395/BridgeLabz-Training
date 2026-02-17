package employee_wage_problem;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        // Creating the object of Employee class
        Employee.display();
        Employee employee1 = new Employee("Virat Kohli");
        employee1.EmployeeAttendance();                    // filling the attendance array for employee name "Virat"
        employee1.DailyEmployeeWage();
        employee1.wagesForMonth();
        employee1.totalWages();
    }
}
// class Employee
class Employee {
    String name;                                          // Stores the name of employee
    int totalHours = 0;                                   // Stores the total hours work done by employee in the month
    int totalDays = 0;                                    // Stores the total days work done by employee in the month
    String[] attendance = new String[30];                 // Stores the employees Attendance for Every Day

    // Constructor of Employee class to initialize variables
    public Employee(String name) {
        this.name = name;
    }

    // This is a static method to display some text
    public static void display() {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
    }

    // This Method Checks Employee is Present or Absent
    // UC-01
    public void EmployeeAttendance() {
        Random rand = new Random();
        for (int i = 0; i < attendance.length; i++) {
            int value = rand.nextInt(3) + 1;
            if (totalHours >= 100 || totalDays >= 20) {
                attendance[i] = "H";                                                // H in attendance array means Employee is on Holiday
            } else {
                switch (value) {
                    case 1:
                        totalDays = totalDays + 1;
                        totalHours = totalHours + 8;
                        attendance[i] = "P";                                       // P in attendance array means Employee is Present on that day
                        break;
                    case 2:
                        attendance[i] = "A";                                       // A in attendance array means Employee is Absent on that day
                        break;
                    case 3:
                        totalDays = totalDays + 1;
                        totalHours = totalHours + 4;
                        attendance[i] = "HD";                                      // HD in attendance array means Employee is on Half Day on that day means partially present
                        break;
                }
            }
        }

    }

    // This employee calculate the Daily wage of Employee
    // UC-02
    public void DailyEmployeeWage() {
        System.out.println("Attendance of the Employee with the name "+this.name+" for this month is : ");
        for (int i = 0; i < attendance.length; i++) {
            switch (attendance[i]) {
                case "H":
                    System.out.println("Day " + (i + 1) + " -> Holiday , Wage -> 0₹");
                    break;
                case "P":
                    System.out.println("Day " + (i + 1) + " -> Present , Wage -> "+(20*8)+"₹");
                    break;
                case "A":
                    System.out.println("Day " + (i + 1) + " -> Absent , Wage -> 0₹");
                    break;
                case "HD":
                    System.out.println("Day " + (i + 1) + " -> Partially Present , Wage -> "+(20*4)+"₹");
                    break;
            }
        }
    }

    // UC-03
    // If employee wants to do Part time work instead of full time or absent
    public void addPartTime(int day) {
        switch (attendance[day]) {
            case "P":
                totalHours = totalHours - 4;
                break;
            case "A":
                if (((totalHours + 4) > 100) || ((totalDays + 1) > 20)) {
                    System.out.println("Your Work Time Exceeds if you do the part time work we don't allow you to work over time becuase of work-life balance.");
                } else {
                    totalHours = totalHours + 4;
                    totalDays = totalDays + 1;
                }
                break;
            case "H":
                System.out.println("There is a holiday on that day you can't do part time work on that day .");
                break;
        }
        if (attendance[day].equals("P")) {

        }
    }

    // This method calculates the wages of an employee for 1 month
    // UC-05
    public void wagesForMonth() {
        if (totalHours >= 100) {
            System.out.println("Total Salary or Wage of Employee with name " + this.name + " is : " + (100 * 20));
        } else {
            System.out.println("Total Salary or Wage of Employee with name " + this.name + " is : " + (this.totalHours * 20));
        }
    }

    // UC-06 , UC - 04
    // Calculate Wages till a condition of total working hours or days is reached for a month
    public void totalWages() {
        int totalWages = 0;
        int hours = 0;
        int days = 0;
        for (int i = 0; i < attendance.length; i++) {

            if (hours >= 100) {
                System.out.println("Total Wage of Employee with name " + this.name + " is : " + (100 * 20));
                return;
            } else if (days >= 20) {
                System.out.println("Total Wage of Employee with name " + this.name + " is : " + (this.totalHours * 20));
                return;
            } else {
                switch (attendance[i]) {
                    case "P":
                        totalWages = totalWages + (20 * 8);
                        break;
                    case "A":
                        totalWages = totalWages + 0;
                        break;
                    case "H":
                        totalWages = totalWages + 0;
                        break;
                    case "HD":
                        totalWages = totalWages + (20 * 4);
                        break;
                }
            }
        }
    }
}


