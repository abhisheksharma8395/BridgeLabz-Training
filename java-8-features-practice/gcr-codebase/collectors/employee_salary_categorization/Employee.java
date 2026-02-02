package collectors.employee_salary_categorization;

public class Employee {
    private String employeeName;
    private String deptName;

    private double salary;

    Employee(String employeeName,String deptName,double salary){
        this.employeeName = employeeName;
        this.deptName = deptName;
        this.salary = salary;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
