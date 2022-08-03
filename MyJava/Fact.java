import java.util.*;
class Fact
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int facti=1;
		int n;
		System.out.println("Enter the value for n :");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
			facti=facti*i;
		System.out.print("factorial of the value for n :");
		System.out.println(n+"is ="+facti);
	}
}