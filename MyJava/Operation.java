import java.util.*;
import progs.check.Prime;
import progs.check.EvenOdd;
import progs.PrintNo;
public class Operation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1'st no :");
		int a=sc.nextInt();
		System.out.println("Enter 2'nd no :");
		int b=sc.nextInt();
		PrintNo pn=new PrintNo(a,b);
		pn.display();
		pn.displayNo();
	}
}
