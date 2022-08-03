import java.util.*;
class Frequency1
{
    //method to display frequency
    public void display()
    {
        int ctr=0;
        int pos=0;
        int r=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the "+(i+1)+"number");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            ctr=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    ctr++;
                    
                }
            }
            if(ctr==1)
            {
                System.out.println("Frequency of "+a[i]+"is"+ctr);
            }
            else
            {
                
                for(int k=0;k<i;k++)
                {
                    if(a[k]==a[i])
                    {
                        r++;
                    }
                }
                if(r==0)
                {
                    System.out.println("Frequency of "+a[i]+"is"+ctr);
                }
            }
        }
    }
}
                    
                   
            