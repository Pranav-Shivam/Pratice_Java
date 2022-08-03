import java.util.*;
class VectorEg
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.add(10);
		v.add("Anjali");
		v.add(56.32);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(1,"Swati");
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v);
		v.add(56.32);
		v.add(56.32);
		v.add(56.32);
		v.add(56.32);
		v.add(56.32);
		v.add(56.32);
		v.add(56.32);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v);
		
	}
}