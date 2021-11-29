import person.PersonClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest{
  public static void main(String[] args) throws Exception { 
   Class reflectClass = PersonClass.class;

   System.out.println("--Name of class--");
   String name = reflectClass.getName();
   System.out.println("Name: "+name);
   
   System.out.println("--Constructors of class--");
   Constructor[] constructors = reflectClass.getConstructors();
   System.out.println("Constructors: "+Arrays.toString(constructors));

   System.out.println("--Declared Methods of class--");
   Method[] declaredMethods = reflectClass.getDeclaredMethods();
   System.out.println("Methods: "+Arrays.toString(declaredMethods));

    System.out.println("--Fields of class--");
   Field[] declaredFields = reflectClass.getDeclaredFields();
   System.out.println("Fields: "+Arrays.toString(declaredFields));

  }
}
