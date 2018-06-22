import java.util.*;
class NotePad
{
	public static void main ()
	{
		Scanner sc = new Scanner (System.in);
		int phys[]=new int [10];
		int chem[]=new int [10];
		int bio[]=new int [10];
		String name[]=new String [10];
		for (int i=0;i<10;i++)
		{
			System.out.print ("Enter Name : ");
			name [i]=sc.nextLine();
			System.out.print("Enter Physics Marks : ");
			phys [i]=sc.nextInt();
			System.out.print("Enter Chemistry Marks : ");
			chem[i]=sc.nextInt();
			System.out.print("Enter Biology Marks : ");
			bio[i]=sc.nextInt();
		}
		for (int i=0;i<10;i++)
			System.out.println (name[i]);
}}
	