import java.util.*;
class Hcflcm
{
    //method to finf hcf and lcm
    public static void main(String args[])
    {
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	System.out.println("The first no is >"+a);
	System.out.println("The first no is >"+b);
        int p,c;
        p=a*b;
        while(a%b!=0)
        {
            c=(a%b);
            a=b;
            b=c;
        }
        System.out.println("hcf="+b);
        System.out.println("lcm="+(p/b));
    }
}
            
           
        
        