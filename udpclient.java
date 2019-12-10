import java.net.*;
import java.util.*;
public class udpclient {
 public static void main(String[] args)throws Exception{
	 DatagramSocket ds = new DatagramSocket(3000);
	 byte[] buf = new byte[1024];
	 System.out.println("msg received from server is :-");
	 DatagramPacket dp=new DatagramPacket(buf,1024);
	 ds.receive(dp);
	 String str= new String(dp.getData(),0,dp.getLength());
	 System.out.println(str);
	 ds.close();
 }
}
