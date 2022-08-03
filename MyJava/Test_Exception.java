class Test_Exception
{
	public static void main(String args[])
	{
		int a=20,b=10,c=10;
		try
		{
			int x=a/(b-c);
			System.out.println("X = "+x);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero");
		}
		int y=a/(b+c);
		System.out.println("Y = "+y);
	}
}