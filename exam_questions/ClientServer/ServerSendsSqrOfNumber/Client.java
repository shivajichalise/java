import java.net.Socket;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("127.0.0.1", 8080);
    System.out.println("Connected!");

    DataInputStream dis = new DataInputStream(socket.getInputStream());
    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

    Integer data;

    while (true) {
      Integer number = new Scanner(System.in).nextInt();

      dos.writeInt(number);
      dos.flush();

      data = dis.readInt();
      System.out.println(data);
    }
  }
}
