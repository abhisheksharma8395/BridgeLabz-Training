import java.util.ArrayList;
import java.util.List;

public class AiDrivenResumeScreeningSystem {
    public static void main(String[] args) {

        // SoftwareEngineer class Object
        SoftwareEngineer softwareEngineer1 = new SoftwareEngineer("Virat","virat18@gmail.com",37,"+918218181818","Delhi",List.of("Java", "DSA", "Spring"));
        SoftwareEngineer softwareEngineer2 = new SoftwareEngineer("Rohit","rohit45@gmail.com",38,"+919245454545","Mumbai",List.of("Java", "Hibernate", "SQL"));
        SoftwareEngineer softwareEngineer3 = new SoftwareEngineer("Rahul","rahul1@gmail.com",32,"+918351515151","Bangalore",List.of("JavaScript", "React", "Node"));

        // DataScientist class object
        DataScientist dataScientist1 = new DataScientist("Ankit","ankit@gmail.com",28,"+916666666666","Pune",List.of("Python", "ML", "Statistics"));
        DataScientist dataScientist2 = new DataScientist("Abhishek","abhi@gmail.com",21,"+918304082004","Noida",List.of("Python", "Deep Learning", "SQL"));

        // Product Manager class Object
        ProductManager productManager1 = new ProductManager("Saket","saku@gmail.com",20,"+916666666666","Gurgaon",List.of("Agile", "Communication", "Leadership"));

        // Creating Resume class object
        Resume<SoftwareEngineer> resume1 = new Resume<>(softwareEngineer1);
        Resume<SoftwareEngineer> resume2 = new Resume<>(softwareEngineer2);
        Resume<SoftwareEngineer> resume3 = new Resume<>(softwareEngineer3);
        Resume<DataScientist> resume4 = new Resume<>(dataScientist1);
        Resume<DataScientist> resume5 = new Resume<>(dataScientist2);
        Resume<ProductManager> resume6 = new Resume<>(productManager1);

        // Calling the method of Resume class objects
        resume1.DisplayInfo();
        resume2.getRoleName();
        resume3.isEligible();
        resume4.matchSkill(List.of("Python", "ML", "SQL", "C++","JavaScript","SpringBoot"));
        resume5.isEligible();
        resume6.DisplayInfo();

    }
}

abstract class JobRole{
    String name;                                             // Stores the name of the person
    String email;                                            // Stores the email of person
    int age;                                                 // Stores the age of the person
    String phone;                                            // Stores the Phone number of person
    String address;                                          // Stores the address of the person
    List<String> skills;                                     // Stores the skills of the person

    // Constructor of JobRole Abstract class to initialize variables.
    public JobRole(String name, String email, int age,String phone, String address, List<String> skills){
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.skills = skills;
    }

    //Abstract method
    public abstract void role();
}

class SoftwareEngineer extends JobRole{

    // Constructor of SoftwareEngineer class to initialize variables.
    public SoftwareEngineer(String name, String email, int age,String phone, String address, List<String> skills){
        super(name, email, age,phone, address, skills);
    }

    // This method is used to display the role
    @Override
    public void role() {
        System.out.println("The Job Role Of Employee is : Software Engineer");
    }

}

class DataScientist extends JobRole{

    // Constructor of DataScientist class to initialize variables.
    public DataScientist(String name, String email, int age,String phone, String address, List<String> skills){
        super(name, email, age,phone, address, skills);
    }

    // This method is used to display the role
    @Override
    public void role() {
        System.out.println("The Job Role Of Employee is : Data Scientist.");
    }

}

class ProductManager extends JobRole{

    // Constructor of ProductManagement class to initialize variables.
    public ProductManager(String name, String email, int age,String phone, String address, List<String> skills){
        super(name, email, age,phone, address, skills);
    }

    // This method is used to display the role
    @Override
    public void role() {
        System.out.println("The Job Role Of Employee is : Product Manager.");
    }

}

class Resume<T extends JobRole>{
    private T candidate;                                      // Stores the details of candidate

    // Constructor of Resume class to initialize variables
    public Resume(T candidate){
        this.candidate = candidate;
    }

    // Displaying the information of candidate
    public void DisplayInfo(){
        System.out.println("__________________________________________________________________");
        System.out.println("Name : "+this.candidate.name);
        System.out.println("Email : "+this.candidate.email);
        System.out.println("Age : "+this.candidate.age);
        System.out.println("Phone : "+this.candidate.phone);
        System.out.println("Address : "+this.candidate.address);
        System.out.println("Skills : "+this.candidate.skills);
        this.candidate.role();
        System.out.println("__________________________________________________________________");

    }

    // This method tells about the role for which candidate applied
    public void getRoleName(){
        System.out.println("Role : ");
        this.candidate.role();
    }

    // This method tells about the is candidate able for screening or not
    public void isEligible(){
        if(this.candidate.age >= 21){
            System.out.println("The Employee with name "+this.candidate.name+" is eligible for screening.");
        }
        else{
            System.out.println("The Employee with name "+this.candidate.name+" is not eligible for screening.");
        }
    }

    // This method match the skill of candidate
    public void matchSkill(List<String> skills){
        int skillsMatched = 0;
        for(String skill : skills){
            if(this.candidate.skills.contains(skill)){
                skillsMatched++;
            }
        }
        double percentageMatched = (((double)skillsMatched / (double)skills.size())*100);
        System.out.printf("Candidate Skills Matched : %.2f%%\n",percentageMatched);
    }
}
