import java.net.*;
import java.util.*;
public class udpserver {
	 public static void main(String[] args)throws Exception{
		 DatagramSocket ds = new DatagramSocket();
		 String str="";
		 System.out.println("enter ur msg to parse");
		 Scanner sc = new Scanner(System.in);
		 str = sc.nextLine();
		 InetAddress ip=InetAddress.getByName("127.0.0.1");
		 DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,3000);
		 ds.send(dp);
		 ds.close();
	 }
}
