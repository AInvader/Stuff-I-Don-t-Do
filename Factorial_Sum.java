import java.util.Scanner;

public class Factorial_Sum {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int s=0,n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            int f= factorial (i);
            s=s+f;
        }
        System.out.println(s);}
    public static int factorial (int x)
    {
        int f=1;
        for (int i=1;i<=x;i++)
            f=f*i;
        return f;
    }
}
