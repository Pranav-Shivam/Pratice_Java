import java.util.*;
class Fib
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int limit;
	int ct=0;
        System.out.println("Enter the limit :");
        limit=sc.nextInt();
        System.out.println("The fibbonacci series upto :"+limit);
        int a=0,b=1,c,l=limit-1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=limit;i++)
        {
            c=a+b;
            if(c<=limit)
            {
                System.out.println(c);
                a=b;
                b=c;
                ct++;
            }
        }
        System.out.println("total no of series in fibonacci series "+(ct+2));
    }
}