import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


class MergeTwoFileAlternatively{
  public static void main(String[] args) throws IOException{
    BufferedReader odd, even;
    File all;
    BufferedWriter bw;
    
    try{
     odd = new BufferedReader(new FileReader("odd.txt")); 
     even = new BufferedReader(new FileReader("even.txt"));
     all = new File("all.txt");
     bw = new BufferedWriter(new FileWriter(all, true));
     String lineOdd, lineEven;
     lineOdd = odd.readLine();
     lineEven = even.readLine();
    
     while (lineOdd != null || lineEven != null) {
       if (lineOdd != null) {
         // System.out.println(odd.readLine());
         bw.write(lineOdd);
         bw.newLine();
         lineOdd = odd.readLine();
       }

       if (lineEven != null) {
         // System.out.println(even.readLine());
         bw.write(lineEven);
         bw.newLine();
         lineEven = even.readLine();
       }
      }

		  bw.flush();
      odd.close();
      even.close();

      bw.close();

    
    }catch(FileNotFoundException e){
      System.out.println("File not found");
    }

  }
}


