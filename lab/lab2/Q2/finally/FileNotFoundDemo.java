import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileNotFoundDemo {

  public static void main(String[] args) {
    try {
    FileReader file = new FileReader("abc.txt");
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } finally {
      File file = new File("abc.txt");
      if (!file.exists()) {
        try{
          file.createNewFile();
          System.out.println("\n So we created the required file.");
        }catch(IOException e){
          System.out.println(e.getMessage());
        }
		  }
    
    }
  }
}
