import java.util.*;
class Fibbo
{
	public static void main(String args[])
	{
		
		int limit;
		System.out.println("Enter the limit :");
		limit=Integer.parseInt(args[0]);
		System.out.println("The fibbonacci series upto :"+limit);
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=limit;i++)
		{
			c=a+b;
			if(c<=limit)
				System.out.println(c);
			a=b;
			b=c;
		}
	}
}