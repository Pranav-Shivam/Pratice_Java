import java.util.*;
class Combination
{
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int s;
        for(int i=1;i<=(n/2)+1;i++)
        {
            for(int j=i;j<=(n/2)+1;j++)
            {
                s=0;
                for(int k=i;k<=j;k++)
                {
                    s=s+k;
                }
                    if(s==n)
                    {
                        for(int t=i;t<=j;t++)
                        {
                            System.out.print(t+" ");
                        }
                    }
                }
            
                    System.out.println();
                    
                }
            }
        }
   // }
//}
        
        