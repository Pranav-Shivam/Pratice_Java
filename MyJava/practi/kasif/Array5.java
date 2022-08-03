import java.util.*;
class Array5
{
    int ar[];
    //default constructor
    Array5()
    {
        ar=null;       
    }
    //method to input and store
    public void inputAndStore()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size  of 2nd array");
        int n=sc.nextInt();       
        ar=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the "+(i+1)+"number of ist array");
            ar[i]=sc.nextInt();
        }        
    }
    //method to shift array elements
    public void shift()
    {
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length-i;j++)
            {
               if((isPrime(ar[j])==true)&&(isPrime(ar[j+1])!=true))
               {
                   int t=ar[j];
                   ar[j]=ar[j+1];
                   ar[j+1]=t;
                }
            }
        }
    }
            
    //method to display array elements
    public void display()
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    //method to check prime
    public boolean isPrime(int n)
    {
        boolean b=false;
        int ctr=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                ctr++;
            }
        }
        if(ctr==2)
        {
            b=true;
        }
        return b;
    }
    //method to search elements
    public void binarySearch(int key)
    {
        int l,up,m;
        boolean present=false;
        l=0;
        up=ar.length-1;
        while(l<=up)
        {
            m=(l+up)/2;
            if(key==ar[m])
            {
                present=true;
                break;
            }
            else if(key>ar[m])
            {
                up=m-1;
            }
            else
            {
                l=m+1;
            }
            
        }
        if(present)
        {
            System.out.println(key+"is present");
        }
        else
        {
            System.out.println(key+"is not present");
        }
    }    
   
   
    //main function
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        inputAndStore();
        display();
        shift();
        display();
        System.out.println("Enter the element to be searched");
        int key=sc.nextInt();
        binarySearch(key);
       
    }
}
            
            
            
            