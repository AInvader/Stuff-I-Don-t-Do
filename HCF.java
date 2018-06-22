import java.util.Scanner;

public class HCF { //Also known as Greatest Common Divisor(GCD)
    public static void main(String args[]) {
        int h=1;
        Scanner sc=new Scanner (System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        for (int i=1;i<=a;i++)
        {
            if (a%i==0 && b%i==0)
                h = i;
            }
            System.out.println("HCF = "+ h);
        }

    }
