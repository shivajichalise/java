import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.DataOutputStream;

public class Server {
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(8080);
    Socket socket = serverSocket.accept();
    System.out.println("Connected!");

    DataInputStream dis = new DataInputStream(socket.getInputStream());
    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

    int data;

    while (true) {
      data = (Integer) dis.readInt();

      Integer square = data * data;
      dos.writeInt(square);
      dos.flush();
    }
  }
}
