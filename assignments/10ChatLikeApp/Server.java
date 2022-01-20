import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.util.Scanner;

class Server{
	public static void main(String[] args){
		try{
			ServerSocket serverSocket = new ServerSocket(9999);
			System.out.println("listening...");
			Socket socket = serverSocket.accept();
			System.out.println("Connected.");
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			String input = "";
			while(true){
				input = (String)dis.readUTF();
				System.out.println(input);
				System.out.print("-: ");
				String message = new Scanner(System.in).nextLine();
				dos.writeUTF(message);
				dos.flush();
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
