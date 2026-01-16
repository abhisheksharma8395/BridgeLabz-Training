package reflection;

import java.lang.reflect.Field;

public class JSONRepresentation {
    public static void main(String[] args) throws IllegalAccessException {
        CollegeStudent student1 = new CollegeStudent("Virat Kohli","GLAU1012",37);
        People people1 = new People("Mahendra Singh Dhoni","Male",43,true);
        JSON json = new JSON();
        System.out.println(json.toJSON(student1));
        System.out.println(" ");
        System.out.println(json.toJSON(people1));
    }
}

// JSON class which includes the method toJSON() method which display the details of object's field
class JSON{
    // This Method is used to return the object's field details in JSON format
    public String toJSON(Object obj) throws IllegalAccessException {

        if(obj == null) return "null";

        // Creating object of StringBuilder class
        StringBuilder json = new StringBuilder();
        // Creating the class object
        Class<?> cls = obj.getClass();
        // Creating the array of field
        Field[] fields = cls.getDeclaredFields();

        json.append("{\n");                              // \n -> for new line in StringBuilder
        for(Field field : fields){
            try{
                // Setting Accessibility to field
                field.setAccessible(true);

                Object object = field.get(obj);

                //    "\"" to add " in string builder
                json.append("\"").append(field.getName()).append("\"");

                if(object instanceof String){
                    json.append(" : ").append("\"").append(field.get(obj)).append("\"").append("\n");
                }
                else{
                    json.append(" : ").append(field.get(obj)).append("\n");
                }
            }catch(Exception e){
                e.getMessage();
            }
        }
        json.append("}");
        return json.toString();
    }
}

// Class CollegeStudent
class CollegeStudent{
    private String studentName;                          // Store the name of College Student
    private String studentRoll;                          // Store the Roll Number of College Student
    private int age;                                     // Stores the age of College Student

    // Constructor of College Student
    public CollegeStudent(String studentName,String studentRoll,int age){
        this.studentName = studentName;
        this.studentRoll = studentRoll;
        this.age = age;
    }

}

// Class People
class People{
    private String personName;                          // Store the name of Person
    private String personGender;                        // Store the Gender of Person
    private int personAge;                              // Stores the age of Person
    private boolean isMarried;                          // Stores the status is person married or not

    // Constructor of College Student to initialize the instance variable
    public People(String personName,String personGender,int personAge,boolean isMarried){
        this.personName = personName;
        this.personGender = personGender;
        this.personAge = personAge;
        this.isMarried = isMarried;
    }

}


