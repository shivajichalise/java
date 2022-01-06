import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


class MergeTwoFile{
  public static void main(String[] args) throws IOException{
    FileReader odd, even;
    File all;
    FileWriter fw;
    int ch;
    
    try{
     odd = new FileReader("odd.txt"); 
     even = new FileReader("even.txt"); 
     all = new File("all.txt");
     fw = new FileWriter(all, true);
    
      while((ch=odd.read()) != -1){
        fw.write((char)ch);
      }

      while((ch=even.read()) != -1){
        fw.write((char)ch);
      }

		  fw.flush();
		  fw.close();
      odd.close();
      even.close();

    
    }catch(FileNotFoundException e){
      System.out.println("File not found");
    }

  }
}


