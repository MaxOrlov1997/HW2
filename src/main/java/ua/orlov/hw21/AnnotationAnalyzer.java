package ua.orlov.hw21;

import lombok.SneakyThrows;
import java.util.HashMap;
import java.util.Map;

/*2.4 Создать класс который будет сканировать все классы и создавать экземпляры тех
классов которые помечены аннотацией @Service. Все эти объекты положить в мапу, где
ключом будет имя класса, а значение объект этого класса.*/
@Value(value = 12)
public class AnnotationAnalyzer {
   static Map<String, Object> objClass = new HashMap<>();
    static int valueTest;
    public static void main(String[] args) throws Exception {
        pars(Value.class);
        scanClass("SomeClass");
        scanClass("ExtendSomeClass");
    }
    public static void pars(Class<?> clas){
      try {
          valueTest = clas.getAnnotation(Value.class).value();
          System.out.println(valueTest);
          throw new RuntimeException();
      } catch (Exception e) {
         // System.out.println(valueTest);
      }
    }
    @SneakyThrows
    public  static void scanClass(String className){
        Class<?> clas =Class.forName(className);
        if(clas.isAnnotationPresent(Service.class)){
            Object classObj = clas.getDeclaredConstructor().newInstance();
            objClass.put(className,classObj);
        }
        System.out.println(objClass);
    }
}
