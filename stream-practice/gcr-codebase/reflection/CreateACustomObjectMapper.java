package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class CreateACustomObjectMapper {
    // This method takes class Object and map and assign the object field value by using map
    public static <T> T toObject(Class<T> clazz , Map<String,Object> properties) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        T object = clazz.getDeclaredConstructor().newInstance();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            field.setAccessible(true);
            if(properties.containsKey(field.getName())){
                field.set(object,properties.get(field.getName()));
            }
        }
        return object;
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        // Creating class Object
        Class<?> clazz = Car.class;
        // Creating the object of Map
        Map<String,Object> map = new HashMap<>();
        // Putting the value inside Map
        map.put("carModel","Nexon Ev");
        map.put("carBrand","Tata");
        map.put("type","Electric Vehicle");
        map.put("maxSpeed",210);
        map.put("carPrice",950000);

        Car car = (Car) toObject(clazz,map);
        System.out.println(car);                                          // Printing the car object
    }
}

class Car{
    String carModel;                                   // Stores the model of car
    String carBrand;                                   // Storest the car brand
    String type;                                       // Stores the type of car (e.g. Electric,Diesel,Petrol)
    int maxSpeed;                                      // Stores the max Speed of car
    int carPrice;                                      // Stores the price of car

    // toString method to represent the object of Car class in String format
    @Override
    public String toString(){
        return "Car Model : "+this.carModel+", Car Brand : "+this.carBrand+", Type Of Car : "+this.type+", Max Speed : "+this.maxSpeed+", Car Price : "+this.carPrice;
    }
}
