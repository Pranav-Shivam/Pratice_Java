import java.io.*;
public class MagicNumber
{
    //fn to evoke
    public static void main(String args[])
    {
        Console co=System.console();
	int m,n;
	m=Integer.parseInt(co.readLine("ENter the lower limit >"));
	n=Integer.parseInt(co.readLine("ENter the upper limit >"));
        if(m>n)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        check(m,n);
    }
    //fn to check for magic no 
    public static boolean isMagic(int n)
    {
        int temp=n,d=0;
        while(temp>9)
        {
            int sum=0;
            for(    ;temp>0;temp/=10)
            {
                d=temp%10;
                sum+=d;
            }
            temp=sum;
        }
        if(temp==1)
            return true;
        else
            return false;
    }
    //fn to display
    public static void check(int m,int n)
    {
        int c=0;
        System.out.println("THE MAGIC INTEGERS ARE:");
        for(int i=m;i<=n;i++)
        {
            if(isMagic(i))
            {
                System.out.print(i+" ");
                c++;
            }
        }
    }
}
