import java.net.DatagramPacket;
import java.net.MulticastSocket;
import java.net.InetAddress;
import java.io.IOException;
import java.net.UnknownHostException;

class Sender {
  public static void main(String[] args) throws IOException, UnknownHostException {
    String msg = "Yoooooooooo";
    String host = "226.4.5.6"; // For udp multicasting only 224.0.0.0 to 239.225.225.225 is allowed
    MulticastSocket ms = new MulticastSocket();

    DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName(host), 5000);
    ms.send(dp);
    ms.close();

  }
}
