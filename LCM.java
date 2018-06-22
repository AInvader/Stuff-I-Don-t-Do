import java.util.Scanner;

public class LCM {
    static int i;
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
        int l;
for (l=a*b;l>=1;l--)
{
    if (l%a==0 && l%b==0)
        i=l;
    }System.out.println("LCM="+ i);
}}