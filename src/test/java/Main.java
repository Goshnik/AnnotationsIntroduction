import java.lang.reflect.Field;

public class Main  {
    public static void main(String[] args) {

        BasedClass basedClass = new BasedClass(12,"Baba", "Yeah and?");
        String res = null;

        try {
            Class<?> testClass = basedClass.getClass();
            Field[] fields = testClass.getDeclaredFields();
            for (Field f : fields){
                if (f.isAnnotationPresent(TestField.class) && f.getAnnotation(TestField.class).textInAnnotation().equals("This is the text in annotation")){
                    TestField tf = f.getAnnotation(TestField.class);
                    System.out.println(tf.textInAnnotation());
                    System.out.println(f.getName() + " = " + f.get(basedClass));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
