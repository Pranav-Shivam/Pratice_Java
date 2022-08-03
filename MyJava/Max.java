/**A java program to find the larger number between two given numbes*/
import java.util.Scanner;
class Max
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			System.out.println("Max="+a);
		else
			System.out.println("Max="+b);
	}
}

	