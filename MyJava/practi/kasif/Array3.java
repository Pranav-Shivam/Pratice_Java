import java.util.*;
class Array3
{
    int list[];
    //default constructor
    Array3()
    {
        list=null;
    }
    //method to input and store
    public void inputAndStore()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        list=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the "+(i+1)+"number");
            list[i]=sc.nextInt();
        }
    }
    //method to display array elements in descending order
    public void bubbleSortDesc()
    {
        int t;
        for(int i=1;i<list.length;i++)
        {
            for(int j=0;j<list.length-i;j++)
            {
                if(list[j]<list[j+1])
                {
                    t=list[j];
                    list[j]=list[j+1];
                    list[j+1]=t;
                }
            }
        }
    }
    //method to display array elements
    public void display()
    {
        for(int i=0;i<list.length;i++)
        {
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }
    //method to search elements
    public void binarySearch(int key)
    {
        int l,up,m;
        boolean present=true;
        l=0;
        up=list.length-1;
        while(l<=up)
        {
            m=(l+up)/2;
            if(key==list[m])
            {
                present=true;
                break;
            }
            else if(key>list[m])
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
        bubbleSortDesc();
        System.out.println("Enter the element to be searched");
        int key=sc.nextInt();
        binarySearch(key);
    }
}
            
            
            
            