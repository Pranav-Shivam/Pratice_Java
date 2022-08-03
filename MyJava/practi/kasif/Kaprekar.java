import java.util.*;
class Kaprekar
{
    //method to check Kaprekar
    public boolean checkKaprekar(int n)
    {
        int rhp;
        int lhp;
        int sum=0;
        boolean b=false;
        int k=n*n;
        int ctr=0;
        int num=n*n;
        while(num!=0)
        {
            ctr++;
            num=num/10;
        }
        int m=ctr/2;
        if(ctr%2==1)
        {
            rhp=k%(int)Math.pow(10,(m+1));
            lhp=k/(int)Math.pow(10,(m+1));
        }
        else
        {
            rhp=k%(int)Math.pow(10,m);
            lhp=k/(int)Math.pow(10,m);
        }
        sum=lhp+rhp;
        if(sum==n)
        {
            b=true;
        }
        return b;
    }
    //method to display kaprekar between the limits
    public void displayKaprekar()
    {
        int p,q;
        int f=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the initial limit");
        p=sc.nextInt();
        System.out.println("enter the final limit");
        q=sc.nextInt();
        System.out.println("kaprekar numbers are:");
        for(int i=p;i<=q;i++)
        {
            if(checkKaprekar(i)==true)
            {
                f++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("frequency of kaprekar no between"+p+"and"+q+"is"+f); 
    }
}
            
            
        
            
            
            
        
        
        
        
        
        
        
        
        
        
