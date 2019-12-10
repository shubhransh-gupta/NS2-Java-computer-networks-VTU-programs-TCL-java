package qwerty;
import java.util.*;

public class crc
{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int []data;
		int []div;
		int []divisor;
		int []rem;
		int []crc;
		int data_bits,d_bits,tot_len;
		System.out.println("enter no of bits");
		data_bits=sc.nextInt();
		data=new int[data_bits];
		System.out.println("enter data bit");
		for(int i=0;i<data_bits;i++) {
			data[i]=sc.nextInt();
			
		}System.out.println("enter no of bits in divisor ");
		d_bits=sc.nextInt();
		divisor=new int[d_bits];
		System.out.println("enter divisor bit");
		for(int i=0;i<d_bits;i++) {
			divisor[i]=sc.nextInt();
			
		}
		tot_len= data_bits +d_bits-1;
		div = new int[tot_len];
		rem=new int[tot_len];
		crc= new int[tot_len];
		for(int i=0;i<data.length;i++) {
			div[i]=data[i];
		}
		System.out.println("Dividend after appending 0's are:");
		for(int i=0;i<div.length;i++) {
			System.out.print(div[i]);
		}System.out.println();
		
		for(int i=0;i<div.length;i++) {
			rem[i]=div[i];
		}System.out.println();
		rem=divide(div,divisor,rem);
		for(int i=0;i<div.length;i++) {
			crc[i]=div[i]^rem[i];
		}System.out.println("crc code");
		for(int i=0;i<crc.length;i++) {
			System.out.print(crc[i]);
		}System.out.println();
		System.out.println("Enter the crc code of "+tot_len+" bits");
		for(int i=0;i<crc.length;i++) {
			crc[i]=sc.nextInt();
		}
		for(int i=0;i<div.length;i++) {
			rem[i]=crc[i];
		}
		rem=divide(crc,divisor,rem);
		for(int i=0;i<rem.length;i++) {
			if(rem[i]!=0)
			{ System.out.print("error");
              break;	
            }
			else if(i==rem.length-1) 
				System.out.println("no error ur crc generated is right");

	}
	}
		static int[] divide(int div[],int divisor[],int rem[]) {
			int cur=0;
			while(true) {
				for(int i=0;i<divisor.length;i++) {
					rem[cur+i]=(rem[cur+i]^divisor[i]);
				}
				while(rem[cur]==0 && cur!=rem.length-1) cur++;
				if((rem.length-cur)<divisor.length) break;
				
			}
			return rem;
		}
}