import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class ReadBytesOfDataAndReadUntilEnd {
  public static void main(String[] args) throws FileNotFoundException, IOException {
    String data = "Bytes of data";
    byte[] bytesData = data.getBytes();

    FileOutputStream fos = new FileOutputStream("exams.txt");
    fos.write(bytesData);
    fos.close();

    FileInputStream fis = new FileInputStream("exams.txt");

    Scanner s = new Scanner(fis);
    while (s.hasNextLine()) {
      String line = s.nextLine();
      System.out.println(line);
    }
    s.close();

  }
}
