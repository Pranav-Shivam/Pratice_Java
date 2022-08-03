class A extends Thread
{
	public void run()
	{
		System.out.println("Starting Thread A:");
		for(int i=1;i<=20;i++)
		{
			System.out.println(" I="+i);
		}
		System.out.println("Exit from Thread A.");
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("Starting Thread B:");
		for(int j=1;j<=20;j++)
		{
			System.out.println("    J="+j);
		}
		System.out.println("Exit from Thread B.");
	}
}
class C extends Thread
{
	public void run()
	{
		System.out.println("Starting Thread C:");
		for(int k=1;k<=20;k++)
		{
			System.out.println("        K="+k);
		}
		System.out.println("Exit from Thread C.");
	}
}
public class MultiThreading
{
	public static void main(String args[])
	{
		new A().start();
		new B().start();
		new C().start();
	}
}