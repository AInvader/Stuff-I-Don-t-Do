import java.util.Scanner;
public class ISBN10 {
    public static void main(String args[]) {
        long s=0;long reverse=0;int c = 0;
                Scanner sc = new Scanner(System.in);
        System.out.print("Enter Code to check for ISBN validity: ");
                long n = sc.nextLong();
        long copy=n;
        while (n > 0) {
            long d = n % 10;
            n = n / 10;
            reverse = (reverse * 10) + d;
        }
        while (reverse > 0) {
            long d2 = reverse % 10;
            c++;
            s = s + (d2 * c);
            reverse = reverse / 10;
        }
        if (s % 11 == 0)
            System.out.println(copy+" is a legal ISBN code");
        else if (c!=10 || s%11!=0){
            System.out.println(copy+" is an illegal ISBN code");}
    }
}
