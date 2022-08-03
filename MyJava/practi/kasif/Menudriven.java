import java.util.*;
class Menudriven
{
    //method to display as users choice
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for pelindrome");
        System.out.println("enter 2 for perfect");
        System.out.println("enter ur choice");
        int ch=sc.nextInt();
        System.out.println("enter the number");
        int n=sc.nextInt();
        
        
        switch(ch)
        {
            case 1:
            
            int p=n;
            int r=0;
            int d=0;
            while(n!=0)
            {
                d=n%10;
                r=r*10+d;
                n=n/10;
            }
            if(p==r)
            {
                System.out.println("pelindrome");
            }
            else
            {
                System.out.println("not pelindrome");
            }
            break;
            case 2:
            
            int s=0;
            p=n;
             for(int i=1;i<n;i++)
             {
                 if(n%i==0)
                 {
                     s=s+i;
                    }
                }
                if(s==n)
                {
                    System.out.println("perfect");
                }
                else
                {
                    System.out.println("not perfect");
                }
                break;
                default:
                System.out.println("wrong choice");
            }
        
            
            
        }
    }
                    
                     
                    
                
                    
        
                
        
       
        
        