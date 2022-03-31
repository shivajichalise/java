import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.SocketException;
import java.io.IOException;

class Server {
  public static void main(String[] a) throws UnknownHostException, SocketException, IOException {
    DatagramSocket ds = new DatagramSocket();
    String message = "What up biatch?";

    InetAddress i = InetAddress.getLocalHost();
    // System.out.println(i);

    DatagramPacket dp = new DatagramPacket(message.getBytes(), message.length(), i, 5000);
    ds.send(dp);
    ds.close();

  }
}
