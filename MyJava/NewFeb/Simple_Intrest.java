import java.util.*;
class Simple_Intrest
{
    public static void main(String args[])
    {
        double p,r,t,SI;
        p=Double.parseDouble(args[0]);
	r=Double.parseDouble(args[1]);
	t=Double.parseDouble(args[2]);
        SI=(p*r*t)/100;
	System.out.println("Principal amount is :->"+p);
	System.out.println("Rate of intrest is :->"+r);
	System.out.println("Time taken is :->"+t);
        System.out.println("Simple Intrest ->"+SI);
    }
}