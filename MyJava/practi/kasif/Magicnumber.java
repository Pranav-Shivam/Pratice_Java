import java.util.*;
class Magicnumber
{
    //method to check magic number
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int num=n;
        while(num>9)
        {
            n=num;
            num=0;
            while(n!=0)
            {
                int a=n/10;
                int b=n%10;
                num=num+b;
                n=a;
            }
        }
        if(num==1)
        {
            System.out.println("magic number");
        }
        else
        {
            System.out.println("not a magic number");
        }
    }
}
    