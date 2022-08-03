import java.util.*;
public class PrimePalindrome
{
    //fn to evoke
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lower limit");
        int m=sc.nextInt();
        System.out.println("enter the upper limit");
        int n=sc.nextInt();
        if(m>n||m>=3000||n>=3000)
        {
            System.out.println("OUT OF RANGE");
            System.exit(0);
        }
        display(m,n);
    }
    //fn to check for prime
    public static boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
            return true;
        else
            return false;
    }
    //fn to check for palindrome
    public static boolean isPalindrome(int n)
    {
        int temp=n,rev=0;
        for(    ;temp>0;temp/=10)
        {
            int d=temp%10;
            rev=rev*10+d;
        }
        if(rev==n)
            return true;
        else
            return false;
    }
    //fn to display
    public static void display(int m,int n)
    {
        int c=0;
        System.out.println("THE PRIME PALINDROME INTEGERS ARE:");
        for(int i=m;i<=n;i++)
        {
            if((isPalindrome(i)&&isPrime(i)))
            {
                System.out.print(i+" ");
                c++;
            }
        }
        System.out.println();
        System.out.println("FREQUENCY OF PRIME PALINDROMIC INTEGERS:"+c);
    }
}
