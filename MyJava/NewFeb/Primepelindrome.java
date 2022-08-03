import java.util.*;
class Primepelindrome
{
    //method to display main between the limits
    public static void main(String args[])
    {       
        int d,i,k=0,r=0,n,p=0,m,z=0;
	m=Integer.parseInt(args[0]);
	n=Integer.parseInt(args[1]);
        System.out.println("The value of initial limit :>"+m);        
        System.out.println("The value of final limit :>"+n);
        System.out.println("Prime Palindrome number between "+m+" and "+n+" are ");
        for(i=m;i<=n;i++)
        {
            m=i;
            r=0;
            p=i;
            do
            {
                d=m%10;
                r=r*10+d;
                m=m/10;
            }
            while(m!=0);
             if(r==p)
                {
                    for(i=1;i<=p;i++)
                    {
                        if(p%i==0)
                        k=k+1;
                    }
                    if(k==2)
                    {
                    System.out.print(p+",");
                    z++;
                    }
                    k=0;
                    
                }
                
                
            }
            System.out.println("no of prime pelindrome ="+z);
        }
    }