import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

class MergeAllFilesFromDesktop {
 
    public static void main(String[] args) throws IOException
    {
        File dir = new File("//home//alphajr//Desktop//");
 
        PrintWriter pw = new PrintWriter("output.txt");
 
        String[] fileNames = dir.list();
 
        for (String fileName : fileNames) {
            File f = new File(dir, fileName);
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = br.readLine();
            while (line != null) {
                pw.println(line);
                line = br.readLine();
            }
            pw.flush();
        }
    }
}
