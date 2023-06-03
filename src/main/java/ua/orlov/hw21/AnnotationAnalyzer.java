package ua.orlov.hw21;
@Value(value = 12)
public class AnnotationAnalyzer {
    static int valueTest=12;
    public static void main(String[] args) throws Exception {
        pars(Value.class);
    }
    public static void pars(Class<?> clas){
      try {
          valueTest = clas.getAnnotation(Value.class).value();
          throw new RuntimeException(String.valueOf(valueTest));
      } catch (Exception e) {
          System.out.println(e);;
      }
    }
}
