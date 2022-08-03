import java.util.*;
class Array4
{
    int a[];
    int b[];
    int c[];
    //default constructor
    Array4()
    {
        a=null;
        b=null;
        c=null;        
    }
    //method to input and store
    public void inputAndStore()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size  of ist array");
        int m=sc.nextInt();
        System.out.println("enter the size  of 2nd array");
        int n=sc.nextInt();
        a=new int[m];
        b=new int[n];
        c=new int[m+n];
        for(int i=0;i<m;i++)
        {
            System.out.println("enter the "+(i+1)+"number of ist array");
            a[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++)
        {
            System.out.println("enter the "+(i+1)+"number of 2nd array");
            b[i]=sc.nextInt();
        }
    }
    //method to display array elements in descending order
    public void bubbleSortAsc( int list[])
    {
        int t;
        for(int i=1;i<list.length;i++)
        {
            for(int j=0;j<list.length-i;j++)
            {
                if(list[j]>list[j+1])
                {
                    t=list[j];
                    list[j]=list[j+1];
                    list[j+1]=t;
                }
            }
        }
    }
    //method to display array elements
    public void display(int list[])
    {
        for(int i=0;i<list.length;i++)
        {
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }
    //method to merge array elements
    public void merge()
    {
        bubbleSortAsc(a);
        bubbleSortAsc(b);
        int i=0;
        int j=0;
        int k=0;
        while(k<a.length+b.length)
        {
        if(i<a.length)
        {
            if(a[i]<b[j])
            {
                c[k]=a[i];
                i++;
                k++;
            }
            else
            {
                c[k]=b[j];
                j++;
                k++;
            }
        }
        else
        {
            c[k]=b[j];
            j++;
            k++;
        }
    }
}

                
    
    //main function
    public void main()
    {
        inputAndStore();
        merge();
       System.out.println("array elements of a after sorting");
       display(a);
       System.out.println("array elements of b after sorting");
       display(b);
       System.out.println("array elements of c after sorting");
       display(c);
       
    }
}
            
            
            
            