package ua.orlov.hw21;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class AllHW21 {
    public static void main(String[] args) throws Exception {
        Constructor<A> constructor = A.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Class<? extends A> clas = A.class;
        Field newId = clas.getDeclaredField("id");
        Field newName = clas.getDeclaredField("name");
        newId.setAccessible(true);
        newId.set("id", "321");
        newName.setAccessible(true);
        newName.set("name" , "B");
        System.out.println(newId.get("id"));
        System.out.println(newName.get("name"));
    }
}
