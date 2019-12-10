package qwerty;
import java.util.*;
import java.net.*;
import java.io.*;
public class servertcp {
	 public static void main(String[] args)throws Exception{
		 Scanner in = new Scanner(System.in);
		 ServerSocket ss = new ServerSocket(4000);
		 Socket sock = ss.accept();
		 InputStream ip = sock.getInputStream();
		 BufferedReader fr = new BufferedReader(new InputStreamReader(ip));
		 String fn=fr.readLine();
		 System.out.println(fn);
		 try {
			 BufferedReader cot = new BufferedReader(new FileReader(fn));
			 OutputStream os = sock.getOutputStream();
			 PrintWriter pw =new PrintWriter(os,true);
			 String str;
			 while((str=cot.readLine())!=null)
				 pw.println(str);
			 pw.close();
			 cot.close();
		 }
		 catch(FileNotFoundException e) {
			 OutputStream os = sock.getOutputStream();
			 PrintWriter pw =new PrintWriter(os,true);
			 pw.println(e);
			 pw.close();
		 }
		 finally {
			 ss.close();
			 sock.close();
			 fr.close();
		 }
				 
}
}	 
