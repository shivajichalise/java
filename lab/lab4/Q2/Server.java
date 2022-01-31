import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		System.out.println("Listening..");
		ServerSocket ss = new ServerSocket(8080);
		Socket socket = ss.accept();
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		System.out.println("Client says:\t"+dis.readLine());
		ss.close();
	}
}
