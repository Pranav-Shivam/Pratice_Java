import java.util.*;
class Number
{
    //method to check nthe validity
    public void getSum()
    {
        int m,n,sum,d,temp,count;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of m");
        m=sc.nextInt();
        System.out.println("enter the value of n");
        n=sc.nextInt();
        if((m<100)||(m>10000)||(n>100))
        {
            System.out.println("input is invalid");
        }
        else
        {
            for(int i=m;i<10000;i++)
            {
                temp=i;
                sum=0;
                count=0;
                while(temp>0)
                {
                    count++;
                    d=temp%10;
                    sum=sum+d;
                    temp=temp/10;
                }
                if(sum==n)
                {
                    System.out.println("the required number="+i);
                    System.out.println("the total no of digits ="+count);
                    break;
                }
            }
        }
    }
}