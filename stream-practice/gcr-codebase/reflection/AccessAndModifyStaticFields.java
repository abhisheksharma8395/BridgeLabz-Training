package reflection;

import java.lang.reflect.Field;

public class AccessAndModifyStaticFields {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Creating the object of Configuration class
        Configuration configure = new Configuration();
        // Class Object
        Class<?> cls = configure.getClass();
        Field staticField = cls.getDeclaredField("API_KEY");
        // Setting accessible static field API_KEY
        staticField.setAccessible(true);
        // Getting the old value of API_KEY
        System.out.println("Older Value of API_KEY : "+staticField.get(null));
        // Setting the new Value for static field API_KEY
        staticField.set(null,"new-secret-api-key-67890");
        // Getting the new value of API_KEY
        System.out.println("New Value of API_KEY : "+staticField.get(null));

    }
}

// Calculator class
class Configuration{
    // Private method multiply of Calculator class
    private static String API_KEY = "default-api-key-12345";
}
