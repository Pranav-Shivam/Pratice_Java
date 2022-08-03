import java.util.*;
class Smithnumber
{
    //method to return sum of digits
    public int findSum(int n)
    {
        int sum=0;
        int d=0;
        while(n!=0)
        {
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        return sum;
    }
    //mthod to check prime
    public boolean check(int n)
    {
        boolean b=false;
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            b=true;
        }
        return b;
    }
    //main method
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int k=findSum(n);
        int sum=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0&&check(i)==true)
                {
                    sum=sum+(findSum(i));
                    n=n/i;
                    i=2;
                }
            
        }
        if(sum==k)
        {
            System.out.println("smith number");
        }
        else
        {
            System.out.println("not a smith number");
        }
    }
}
            
               
        
           