import java.util.*;
class Primepelindrome
{
    //method to display prime pelindrome between the limits
    public void displayPrimepel()
    {
        Scanner sc=new Scanner(System.in);
        int d,i,k=0,r=0,n,p=0,m,z=0;
        System.out.println("enter the value of initial limit");
        m=sc.nextInt();
        System.out.println("enter the value of final limit");
        n=sc.nextInt();
        System.out.println("prime pelindrome number between"+m+"and"+n+"are");
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
                    }k=0;
                    
                }
                
                
            }
            System.out.println("no of prime pelindrome ="+z);
        }
    }
            
           
    
                        
                    
                    
                       
                    
                    
                    
                        
                    
                        
                            
                        
                    
                    
                        
            
               
                        
                        
                            
                        
                    
                    
                        
            