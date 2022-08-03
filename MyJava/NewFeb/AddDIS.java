import java.io.*;
class AddDIS
{
	public static void main(String args[])throws IOException
	{
		int a,b,c;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the first no >");
		a=Integer.parseInt(dis.readLine());
		System.out.println("Enter the 2 nd no >");
		b=Integer.parseInt(dis.readLine());
		c=a+b;
		System.out.println("Sum ="+c);
	}
}
