import java.util.*;
public class Prime_Hundred 
{
	private static Scanner sc;
	public static void main(String args[]) 
	{
		sc = new Scanner (System.in);
		System.out.println("Enter Limit");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			boolean b = prime (i);
			if (b==true)
				System.out.print (i+",");
					}
		
	}
public static boolean prime (int x)
{
	int f=0;
	for (int j=1;j<=x;j++)
	{
		if (x%j==0)
			f++;
	}
	if (f==2)
		return true;
	else
		return false;
	}
}

