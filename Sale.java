import java.util.Scanner;

public class Sale {
        public static void main (String args[]) {
        Scanner sc =new Scanner(System.in); int p = sc.nextInt();
            if (p <= 2000) {
            System.out.println((double)p - 0.05D * (double)p + " Gift - Calculator");
        } else if (p > 2000 && p <= 5000) {
            System.out.println((double)p - 0.1D * (double)p + " Gift - School Bag");
        } else if (p > 5000 && p <= 10000) {
            System.out.println((double)p - 0.15D * (double)p + " Gift- Wall Clock");
        } else {
            System.out.println((double)p - 0.2D * (double)p + " Gift-Wrist Watch");
        }

    }
}


