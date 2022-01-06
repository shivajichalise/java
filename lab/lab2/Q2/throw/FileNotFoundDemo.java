import java.io.FileReader;
import java.io.FileNotFoundException;

class FileNotFoundDemo {

  public static void main(String[] args) throws FileNotFoundException {
    FileReader file = new FileReader("abc.txt");
    throw new FileNotFoundException();  
  }
}
