import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class ReadFromOneFileAndStoreInAnother {
  public static void main(String[] args) throws IOException {
    FileReader one;
    File another;
    FileWriter fw;
    int ch;

    try {
      one = new FileReader("one.txt");
      another = new File("another.txt");
      fw = new FileWriter(another, true);

      while ((ch = one.read()) != -1) {
        fw.write((char) ch);
      }

      fw.flush();
      fw.close();
      one.close();

    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }
}
