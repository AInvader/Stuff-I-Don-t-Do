import java.util.*;
public class PasswordCheckEclipse {
    private static Scanner sc;

	public static void main (String args[])
    {
        int c=0;
                System.out.println("Enter Password");
        sc = new Scanner(System.in);
        String password=sc.nextLine();
               String check = "SmashMouth";
        if (check.equals(password))
        {
            System.out.println("Content");
        c=6;
            }
         else {
            System.out.println("Wrong Password");
                        c++;
            System.out.println("Chances left"+" "+(5-c));}
            while (c<5)
            {
                System.out.println("Reenter Password");
                password = sc.nextLine();
                       check = "SmashMouth";
                if (check.equals(password)) {
                    System.out.println("Content");
                     c=6;               } else {
                    System.out.println("Wrong Password");
                    c++;
                    System.out.println("Chances left"+" "+(5-c));}

            }if (c==5)
                System.out.println("Brute Force Attack nullified");


        }
    }

