import java.util.*;
class Fibbo
{
	public static void main(Strings args[])
	{
		Scanner sc=new Scanner(System.in);
		int limit;
		System.out.println("Enter the limit :");
		limit=sc.nextInt();
		System.out.println("The fibbonacci series upto :"+limit);
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=limit;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}