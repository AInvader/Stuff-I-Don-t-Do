import java.util.Scanner;
public class Reverse {
private static Scanner sc;
public static void main (String args[])
{sc = new Scanner (System.in);
int n=sc.nextInt();
	while (n>0)
	{
		int d =n%10;
		System.out.print(d);
		n=n/10;
	}
}
}
