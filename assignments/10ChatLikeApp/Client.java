import java.net.Socket;
import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.DataInputStream;

class Client{
	public static void main(String[] args){
		try{
			System.out.println("Connecting to server.");
			Socket socket = new Socket("localhost",9999);
			System.out.println("Request Accepted.\n Connection Established.");
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String input = "";
			while(true){
				System.out.print("-: ");
				String message = new Scanner(System.in).nextLine();
				dos.writeUTF(message);
				dos.flush();
				input = dis.readUTF();
				System.out.println(input);

			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
