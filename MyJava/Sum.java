import java.util.*;
class Sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value for a and b :");
		a=sc.nextInt();
		b=sc.nextInt();
		int x=a+b;
		System.out.println("The sum of"+a+" and "+b+" is :");
		System.out.println(x);
	}
}