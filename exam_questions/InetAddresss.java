import java.net.InetAddress;
import java.net.UnknownHostException;

class InetAddresss {
  public static void main(String[] a) throws UnknownHostException {
    InetAddress i = InetAddress.getLocalHost();
    InetAddress i1 = InetAddress.getByName("shivajichalise.com.np");
    byte[] addr = { 127, 0, 0, 1 };
    InetAddress i2 = InetAddress.getByAddress(addr);
    InetAddress i3[] = InetAddress.getAllByName("www.facebook.com");

    System.out.println(i);
    System.out.println(i1);
    System.out.println(i2);

    for (int j = 0; j < i3.length; j++) {
      System.out.println("ALL InetAddresses of Named Host : " + i3[j]);
    }

  }
}
