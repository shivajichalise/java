import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class FindEmployeesFromKTM {
  public static void main(String args[]) throws FileNotFoundException, IOException {
    String word = "Kathmandu";

    BufferedReader br = new BufferedReader(new FileReader("emp.txt"));

    for (String line; (line = br.readLine()) != null;) {
      if (line.indexOf(word) != -1)
        System.out.println(line);
    }

    br.close();
  }
}
