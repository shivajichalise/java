import java.io.FileNotFoundException;
import java.io.FileReader;

class FileNotFoundDemo{
  public static void main(String[] args){
  try{
      FileReader file = new FileReader("abc.txt");
  }catch(FileNotFoundException e){
    System.out.println(e.getMessage());
  }
  
}}
