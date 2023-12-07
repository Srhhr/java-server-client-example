import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {
		/*//////////////////////////////////////////////
				TODO:
				Connecing server and client -
		//////////////////////////////////////////////*/
		
		/*///////
		 CONFIG
		///////*/
		int port = 9806; // port
		/*///////
		  CODE
		///////*/
		
		try {
			System.out.println("[~] Waiting for connections...");
			ServerSocket server_socket = new ServerSocket(port);
			Socket sock = server_socket.accept();
			System.out.println("[#] Connection established!");
		}
		catch (Exception exp) {
			System.out.println("[!] Error: ");
			exp.printStackTrace();
		}
		
	}
	
}