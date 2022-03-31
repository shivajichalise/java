import java.net.Socket;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

class Client {
  public static void main(String[] a) throws IOException {
    Socket s = new Socket("127.0.0.1", 5000);

    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
    DataInputStream dis = new DataInputStream(s.getInputStream());

    Integer i, o;
    while (true) {
      o = new Scanner(System.in).nextInt();

      dos.writeInt(o);
      dos.flush();

      i = dis.readInt();
      System.out.println(i);

    }

  }
}
