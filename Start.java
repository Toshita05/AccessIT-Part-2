import javax.swing.JOptionPane;
import java.net.Socket;
public class Start {
	static String port = "4907";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ip=JOptionPane.showInputDialog("Please Enter Server IP address");
		new Start().initialize(ip,Integer.parseInt(port));
		
	}
	public  void initialize(String ip, int port) {
		// TODO Auto-generated method stub
		try {
			Socket sc = new Socket(ip,port);
			System.out.println("Awaiting Connection From server. Please Wait :)");
			Authentication frame1 = new Authentication(sc);
			frame1.setSize(300,80);
			frame1.setLocation(500,300);
			frame1.setVisible(true);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}