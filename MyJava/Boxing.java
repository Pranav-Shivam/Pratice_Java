class Boxing
{ 
	public static void main(String args[])
	{
		int a=10; //primitive type
		Integer x=a; //primitive->object:Boxing or Autoboxing
		int b=x; //object->primitive: Unboxing
		System.out.println("a="+a);
		System.out.println("x="+x);
		System.out.println("b="+b);
	}
}