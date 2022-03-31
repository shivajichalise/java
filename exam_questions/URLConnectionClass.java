import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

class URLConnectionClass {
  public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
    URL u = new URL("http://shivajichalise.com.np/profile.php?=asdasdas");
    System.out.println("Protocol: " + u.getProtocol());
    System.out.println("Host: " + u.getHost());
    System.out.println("Port: " + u.getPort());
    System.out.println("File: " + u.getFile());
    System.out.println("Query: " + u.getQuery());
    System.out.println("URI: " + u.toURI());

    URLConnection uc = u.openConnection();
    InputStream is = uc.getInputStream();
    int i;
    while ((i = is.read()) != -1) {
      System.out.println((char) i);
    }
  }
}
