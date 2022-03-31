import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.io.IOException;

class Client {
  public static void main(String[] a) throws SocketException, IOException {
    DatagramSocket ds = new DatagramSocket(5000);
    byte[] b = new byte[1024];
    DatagramPacket dp = new DatagramPacket(b, 1024);

    ds.receive(dp);
    System.out.println(new String(dp.getData()));
    ds.close();
  }
}
