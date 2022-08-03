import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        int rev=0;
        int m=n;
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("Reverse of "+m+" is "+rev);
    }
}