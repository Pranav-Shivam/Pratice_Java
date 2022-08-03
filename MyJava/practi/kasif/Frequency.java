import java.util.*;
class Frequency
{
    public int getFrequency(int A[],int k)
    {
        int ctr=0;
        int n=A.length;
        for(int i=0;i<n;i++)
        {
            if(A[i]==k)
            {
                ctr++;
            }
        }
        return ctr;
    }
    public int findMax(int A[])
    {
        int max=A[0];
        int n=A.length;
        for(int i=0;i<n;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        return max;
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int ar[]=new int[n];
        int s=0;
        int k=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the value of="+"ar"+(i));
            ar[i]=sc.nextInt();
        }
        System.out.println("number"+"\t"+"frequency");
        s=findMax(ar);
        for(int i=0;i<=s;i++)
        {
        k=getFrequency(ar,i);
        if(k>0)
        {
            System.out.println(i+"\t"+k);
        }
        }
    }
}
        
           
        