import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

class Dog {
  private String name;
  private int age;

  public Dog() {
    this.name = "Max";
    this.age = 8;
  }

  public Dog(String name, int age) {
    this.name = "Max";
    this.age = 8;
  }
}

class Reflection {
  public static void main(String[] args) {
    Dog max = new Dog();
    Class maxReflect = max.getClass();

    System.out.println("Details on Max: \n");
    System.out.println("Name: " + maxReflect.getName());
    System.out.println("Is Interface? " + maxReflect.isInterface());
    System.out.println("Is Array? " + maxReflect.isArray());

    System.out.println("Contructors: ");
    Constructor[] constructors = maxReflect.getConstructors();
    for (Constructor constructor : constructors) {
      System.out.println("Name: " + constructor.getName());

      System.out.println("Parameters: ");
      Parameter[] parameters = constructor.getParameters();
      for (Parameter parameter : parameters) {
        System.out.println("Name: " + parameter.getName() + " " + parameter.getType());
      }
    }

  }
}
