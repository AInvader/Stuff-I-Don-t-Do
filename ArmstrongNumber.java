import java.util.Scanner;
public class ArmstrongNumber {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner (System.in);
		System.out.println("Enter a number to check for Armstrong");
		int n=sc.nextInt() ,s=0, copy=n;
		while (n>0)
		{
			int d=n%10;
			s=s+(d*d*d);
			n=n/10;
		}
		if (s==copy)
			System.out.println("Armstrong");
		else 
			System.out.println("Not Armstrong");
	}
}
