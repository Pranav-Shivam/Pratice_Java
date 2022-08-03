import java.util.*;
class Ascending
{
    //method to display digity in ascending order
    public void display()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter tne number");
        int n=sc.nextInt();
        int d=0;
        for(int i=0;i<=9;i++)
        {
            int p=n;
            while(p!=0)
            {
                d=p%10;
                if(d==i)
                {
                    System.out.println(d+",");
                }
                p=p/10;
            }
        }
    }
}
                
        
     