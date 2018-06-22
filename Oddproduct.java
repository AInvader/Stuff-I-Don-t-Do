import java.util.*;
public class Oddproduct {
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();int copy=n;int oddproduct=1;int c=0;
		while (n>0)
		{
			int d=n%10;
			n=n/10;
			++c;
			if (d%2==0)
			{
				int odd=copy%((int)(Math.pow(10, c-1)));
				oddproduct=oddproduct*odd;
			}			
		}
		System.out.println(oddproduct);
	}

}
