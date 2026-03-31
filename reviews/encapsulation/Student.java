package encapsulation;

public class Student {
    private String studentName;
    private int studentId;

    public Student(int studentId,String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public int getStudentId(){
        return this.studentId;
    }

    public void setStudentIs(int studentId){
        this.studentId = studentId;
    }
}
