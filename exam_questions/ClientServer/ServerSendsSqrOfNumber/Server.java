import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

class Server {
  public static void main(String[] a) throws IOException {
    ServerSocket ss = new ServerSocket(5000);
    Socket s = ss.accept();

    DataInputStream dis = new DataInputStream(s.getInputStream());
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());

    int data;

    while (true) {
      data = (Integer) dis.readInt();
      Integer square = data * data;

      dos.writeInt(square);
      dos.flush();

    }
  }
}
