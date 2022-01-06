import java.io.FileReader;
import java.io.FileNotFoundException;

class FileNotFoundDemo {

  public FileReader readFile(String name) throws FileNotFoundException{
    FileReader file = new FileReader(name);
    return file;
  }

  public static void main(String[] args) {
    FileNotFoundDemo d = new FileNotFoundDemo();
    
    try {
      d.readFile("abc.txt");
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
}
}
