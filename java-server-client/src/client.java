import java.net.Socket;

public class Clinet {
	
	public static void main(String[] args) {
		/*///////
		 CONFIG
		///////*/
		
		int port = 9806; // port
		String ip_addres = "localhost"; // ip (change to your if you want)
		
		/*///////
		  CODE
		///////*/
		
		try {
			System.out.println("[~] Client started");
			Socket soc = new Socket(ip_addres, port);
		}
		catch (Exception exp) {
			System.out.println("[!] Error: ");
			exp.printStackTrace();
			// ping 209.85.233.100 -t
		}
	}
	
}