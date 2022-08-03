import java.util.*;
class compositemagicnumber
{
    //method to check composite
    public boolean checkComposite(int n)
    {
        boolean b=false;
        int ctr=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                ctr++;
            }
        }
        if(ctr>2)
        {
            b=true;
        }
        return b;
    }
    //method to check magic number
    public boolean checkMagic(int n)
    {
        boolean b=false;
        int digit=0,sum=0;
        while(n>9)
        {
            sum=0;
            while(n>0)
            {
                digit=n%10;
                sum=sum+digit;
                n=n/10;
            }
            n=sum;
        }
        if(n==1)
        {
            b=true;
        }
        return b;
    }
    //method to display compositemagic number
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the initial limit");
        int m=sc.nextInt();
        System.out.println("enter the final limit");
        int n=sc.nextInt();
        int c=0;
        if(m<n)
        {
            System.out.println("composite magic numbers are");
            for(int i=m;i<=n;i++)
            {
                if(checkComposite(i)==true&&checkMagic(i)==true)
                {
                    c++;
                    System.out.print(i+" ,");
                }
            }
            System.out.println();
            System.out.println("no of composite magic number="+c);
        }
        else
        {
            System.out.println("invalid input");
        }
    }
}
                    
                
                
            
            

    
        
        
                  