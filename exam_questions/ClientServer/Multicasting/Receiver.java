import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

class Receiver {
  public static void main(String[] args) throws IOException {
    String host = args[0];

    MulticastSocket ms = new MulticastSocket(5000);
    ms.joinGroup(InetAddress.getByName(host));

    byte[] b = new byte[1024];

    DatagramPacket dp = new DatagramPacket(b, 1024);
    ms.receive(dp);

    String message = new String(dp.getData(), 0, dp.getLength());

    System.out.println(message);

  }
}
