class Test2_Exception
{
	public static void main(String args[])
	{
		int a,b,ans;
		try
		{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			try
			{
				ans=a/b;
				System.out.println("Result ="+ans);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divison by zero");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Incorrect Arguement type");
		}
	}
}