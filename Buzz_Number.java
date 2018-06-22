import java.util.Scanner;

public class Buzz_Number {
    public static void main (String args[])
    { Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();


        int lastdigit = n%10;
                if (lastdigit == 7 || n%7==0)
                    System.out.println ("Buzz Number");
                else
                    System.out.println("Not");

    }
}
