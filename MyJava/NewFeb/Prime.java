import java.util.*;
class Prime
{
    public static void main()
    {
	import java.util.*;
class Prime
{
    Scanner sc=new Scanner(System.in);
    void main()
    {
        System.out.println("enter the no.");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(isPrime(i)==true)
            {
                System.out.println("\t"+i);
            }
        }
    }
    boolean isPrime(int m)
    {
        int ct=0;
        for(int i=1;i<=m;i++)
        {
            if(m%i==0)
                ct++;
        }
        if(ct==2)
           return true;
        else 
           return false;
    }
}

        
        System.out.println("enter the no.");
        int n=scr.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(isPrime(i)==true)
            {
                System.out.println("\t"+i);
            }
        }
    }
    public static boolean isPrime(int m)
    {
        int ct=0;
        for(int i=1;i<=m;i++)
        {
            if(m%i==0)
                ct++;
        }
        if(ct==2)
           return true;
        else 
           return false;
    }
}

        