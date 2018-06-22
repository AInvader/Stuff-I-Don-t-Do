import java.util.Scanner;
public class SubjectMarksTab {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        for (int i=1;i<=50;i++)
{
    int RollNo = sc.nextInt();
    int SubjectA = sc.nextInt();
    int SubjectB = sc.nextInt();
    int SubjectC = sc.nextInt();
    int SubjectD = sc.nextInt();
    int AverageMarks=((SubjectA+SubjectB+SubjectC+SubjectD)/4);
if (AverageMarks>80)
    System.out.println(RollNo+" "+AverageMarks);
else if (AverageMarks<40)
    System.out.println(RollNo+" "+AverageMarks);
else
    System.out.println(AverageMarks);
}}}

