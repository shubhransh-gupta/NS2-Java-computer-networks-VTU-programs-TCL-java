package qwerty;
import java.util.Scanner;
public class bellman {
	
	
	 private int D[];
	private int n;
	public static final int MAX = 999;
	public bellman(int n)
	{ 
		this.n=n;
	    D = new int[n+1];
	}
	public void shortest(int s,int A[][])
	{ 
		for (int i=1;i<=n;i++)
	{
			D[i]=MAX;
	} 
		D[s] = 0;
	for(int k=1;k<=n-1;k++)
	{
		for(int i=1;i<=n;i++)
	{ 
			for(int j=1;j<=n;j++)
	{ 
				if(A[i][j]!=MAX)
	{ 
					if(D[j]>D[i]+A[i][j])
	D[j]=D[i]+A[i][j];
	}
	}
	}
	}
	for(int i=1;i<=n;i++)
	{ for(int j=1;j<=n;j++)
	{ if(A[i][j]!=MAX)
	{ if(D[j]>D[i]+A[i][j])
	{
	System.out.println("The Graph contains negative egde cycle");
	
	} }
	}
	}
	for(int i=1;i<=n;i++)
	{
	System.out.println("Distance of source " + s + " to "+ i + " is " + D[i]);
	}
	}
	public static void main(String[ ] args)
	{ 
		int n=0,s;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of vertices");
	n = sc.nextInt(); 
	
	int A[][] = new int[n+1][n+1];
	System.out.println("Enter the Weighted matrix");
	for(int i=1;i<=n;i++)
	{ for(int j=1;j<=n;j++)
	{ A[i][j]=sc.nextInt();
	
	
	if(A[i][j]==0)
	{ A[i][j]=MAX;
	}
	}
	}
	System.out.println("Enter the source vertex");
	s=sc.nextInt();
	bellman b = new bellman(n);
	b.shortest(s,A);
	sc.close();
	}
	}



