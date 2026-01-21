package csv_data_handling;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCSVData {
    public static void main(String[] args) {
        String filePath = "io-programming-practice/gcr-codebase/csv_data_handling/employeeDetails.csv";
        List<Employee> ansList = new ArrayList<>();
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            // To skip the header
            reader.readNext();
            String[] columns;
            while((columns = reader.readNext())!=null){
                int employeeId = Integer.parseInt(columns[0]);
                String employeeName = columns[1];
                String department = columns[2];
                int salary = Integer.parseInt(columns[3]);
                ansList.add(new Employee(employeeId,employeeName,department,salary));
            }
            Collections.sort(ansList, (a,b) -> b.salary - a.salary);
            for(int i = 0;i<5;i++){
                ansList.get(i).display();
            }
        }catch(IOException e){
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }

}

class Employee{
    int employeeId;                                // Stores the employee Id
    String employeeName;                           // Stores the employee name
    String department;                             // Stores the department of employee
    int salary;                                    // Stores the salary of employee

    // Constructor of Employee class
    public Employee(int employeeId,String employeeName,String department,int salary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    public void display(){
        System.out.println("ID : "+this.employeeId+", Name : "+this.employeeName+", Department : "+this.department+", Salary : "+this.salary);
    }

}
