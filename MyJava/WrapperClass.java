class WrapperClass
{
	public static void main(String args[])
	{
		int a=10;
		Integer x=Integer.valueOf(a,2);
		int b=x.intValue();
		System.out.println("a="+a);
		System.out.println("x="+x);
		System.out.println("b="+b);
	}
}