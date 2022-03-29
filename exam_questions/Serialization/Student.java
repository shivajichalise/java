import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Student implements Serializable {
  private static final long serialVersionUID = 1L;
  int roll;
  String name;

  Student(int roll, String name) {
    this.roll = roll;
    this.name = name;
  }

  public static void main(String[] args) {
    Student s1 = new Student(12, "Ram Poudel");
    Student s2 = new Student(12, "Shyam Ranabhat");

    try {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.txt"));
      oos.writeObject(s1);
      oos.writeObject(s2);
      oos.flush();
      oos.close();

      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("output.txt"));
      Student ram = (Student) ois.readObject();
      Student shyam = (Student) ois.readObject();

      System.out.println(ram.roll + " " + ram.name);
      System.out.println(shyam.roll + " " + shyam.name);
      ois.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
