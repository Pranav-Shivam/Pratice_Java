import java.util.*;
class Hcflcm
{
    //method to finf hcf and lcm
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int p,c;
        p=a*b;
        while(a%b!=0)
        {
            c=(a%b);
            a=b;
            b=c;
        }
        System.out.println("hcf="+b);
        System.out.println("lcm="+(p/b));
    }
}
            
           
        
        