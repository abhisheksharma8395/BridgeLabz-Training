package reflection;

import java.lang.reflect.Field;

public class AccessPrivateField  {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person();
        Class<?> cls = person.getClass();
        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);
        System.out.println("Old Value of Age Instance Variable : "+field.get(person));
        field.set(person,30);
        System.out.println("New Value of Age Instance Variable : "+field.get(person));
    }
}

class Person{
    private int age = 21;
}
