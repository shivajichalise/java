import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.util.Scanner;

public class Server {
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(8080);
    Socket socket = serverSocket.accept();
    System.out.println("Connected!");

    DataInputStream dis = new DataInputStream(socket.getInputStream());
    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

    String data = "";

    while (true) {
      data = (String) dis.readUTF();
      System.out.println(data);
      String message = new Scanner(System.in).nextLine();
      dos.writeUTF(message);
      dos.flush();
    }
  }
}
