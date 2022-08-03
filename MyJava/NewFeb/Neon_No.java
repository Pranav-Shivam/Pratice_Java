import java.io.*;
class Neon_No
{
	public static void main(String args[])
	{
		int n,sum,sq;
		Console co=System.console();
		n=Integer.parseInt(co.readLine("Enter any no. >"));
		int m=n;
		sq=n*n;
		sum=digSum(sq);
		if(m==sum)
			System.out.println(n+" is a neon no");
		else
			System.out.println(n+" is not a neon no");
	}
	public static int digSum(int n)
	{
		int m=n;
		int sum=0;
		while(n!=0)
		{
			int dig=n%10;
			sum=sum+dig;
			n=n/10;
		}
		return sum;
	}
}