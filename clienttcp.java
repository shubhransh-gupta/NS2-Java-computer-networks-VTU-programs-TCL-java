package qwerty;
import java.util.*;
import java.net.*;
import java.io.*;

public class clienttcp {
 public static void main(String[] args)throws Exception{
	 Scanner in = new Scanner(System.in);
	 Socket sock = new Socket("127.0.0.1",4000);
	 System.out.println("enter the name of file");
	 String fname=in.next();
	 OutputStream os = sock.getOutputStream();
	 PrintWriter pw = new PrintWriter(os,true);
	 pw.println(fname);
	 InputStream ip = sock.getInputStream();
	 BufferedReader sr = new BufferedReader(new InputStreamReader(ip));
	 String str="";
	 while((str=sr.readLine())!=null)
		 System.out.println(str);
	 pw.close();
	 sr.close();
			 
	 
 }
}
