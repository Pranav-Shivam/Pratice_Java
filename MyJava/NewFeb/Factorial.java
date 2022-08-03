import java.util.*;
class Factorial
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        System.out.println("THe no is :"+n);
        System.out.println("Factorial of a :");
        int facti=1;
        for(int i=1;i<=n;i++)
        {
            facti=facti*i;
        }
        System.out.println("is :="+facti);
    }
}
