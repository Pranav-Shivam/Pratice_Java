package progs;
import progs.check.*;
public class PrintNo
{
	int x,y;
	public PrintNo(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void display()
	{
		System.out.println("X = "+x+"\tY = "+y);
	}
	public void displayNo()
	{
		Prime p=new Prime();
		EvenOdd eo=new EvenOdd();
		for(int i=x;i<=y;i++)
		{
			if(p.isPrime(i)==true)
			{
				System.out.print(i+" isPrime");
			}
			else
			{
				System.out.print(i+" is notPrime");
			}
			if(eo.isEvenOrOdd(i)==true)
			{
				System.out.print(" and is even");
			}
			else
			{
				System.out.print(" and is odd");
			}
			System.out.println();
		}
		
	}
}