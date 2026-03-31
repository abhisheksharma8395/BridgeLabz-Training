package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ImplementRoleBasedAccessControl {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        // Creating the Objects of User class
        User user1 = new User("Abhishek",26);
        User user2 = new User("Virat",37);
        User user3 = new User("Mahendra Singh Dhoni",43);
        User user4 = new User("Rohit Sharma",39);
        User user5 = new User("Faf Du Plesis",41);
        User user6 = new User("Hardik Pandya",32);

        // Adding User Object into list by using addUser method of User class
        User.addUser(user1);
        User.addUser(user2);
        User.addUser(user3);
        User.addUser(user4);
        User.addUser(user5);
        User.addUser(user6);

        // Creating the object of Admin class
        Admin admin = new Admin("Abhishek Sharma",21);

        // Passing Admin class Object in method ValidateAccess of class RoleAllowedOnlyAdmin
        RoleAllowedOnlyAdmin.ValidateAccess(admin,user5);
        // Passing User class Object in method ValidateAccess of class RoleAllowedOnlyAdmin
        RoleAllowedOnlyAdmin.ValidateAccess(user1,user6);
    }

}

// RoleAllowedOnlyAdmin class
class RoleAllowedOnlyAdmin{
    // ValidateAccess method it will only run when you pass object of that class where your annotation value is "ADMIN"
    public static void ValidateAccess(Object obj , User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> cls = obj.getClass();
        if(cls.isAnnotationPresent(RoleAllowed.class)){
            RoleAllowed annotation = cls.getAnnotation(RoleAllowed.class);
            if(annotation.value().equals("ADMIN")){
                Method method = cls.getDeclaredMethod("removeUser",User.class);
                method.setAccessible(true);
                method.invoke(obj,user);
            }
            else{
                System.out.println("Access Denied");
            }
        }
    }
}

// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface RoleAllowed{
    String value() default "User_Type";
}


// User Class
@RoleAllowed(value = "USER")
class User{
    String userName;                                   // Stores the username
    int userAge;                                       // Stores the userAge
    static List<User> list = new ArrayList<>();        // Stores the list of user

    // Constructor of User class
    public User(String userName,int userAge){
        this.userName = userName;
        this.userAge = userAge;
    }

    // This method is used to add the user
    public static void addUser(User user){
        User.list.add(user);
        System.out.println("USER Added SuccessFully");
    }

}



// User Class
@RoleAllowed(value = "ADMIN")
class Admin{
    String adminName;                      // Stores the Admin name
    int adminAge;                          // Stores the Admin age

    // Constructor of Admin class
    public Admin(String adminName,int adminAge){
        this.adminName = adminName;
        this.adminAge = adminAge;
    }

    // This method is used to remove the user
    public void removeUser(User user){
        User.list.remove(user);
        System.out.println("USER with name "+user.userName+" Removed SuccessFully");
    }

}