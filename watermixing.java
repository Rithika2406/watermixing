import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t-->0)
		{
		    int A=S.nextInt();
		    int B=S.nextInt();
		    int X=S.nextInt();
		    int Y=S.nextInt();
		    if(A-Y<=B && B<=A+X)
		    {
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}
}
