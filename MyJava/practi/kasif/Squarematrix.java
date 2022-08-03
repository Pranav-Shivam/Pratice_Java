import java.util.*;
class Squarematrix
{
    private int list[][];
    //default constructor
    Squarematrix()
    {
        list=null;
    }
    //method to input and store
    public void inputAndStore()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int n=sc.nextInt();
        if(n>20)
        {
            System.out.println("value of n cannot be greater than 20");
            System.exit(0);
        }
        list=new int[n][n];
        for(int i=0;i<list.length;i++)
        {
            for(int j=0;j<list[0].length;j++)
            {
                System.out.println("enter the value of list["+i+"]["+j+"]");
                list[i][j]=sc.nextInt();
            }
        }
    }
    //function to find largest and second largest
    public void large()
    {
        int max1=list[0][0];
        int max2=list[0][0];
        int p=0,q=0;
        for(int i=0;i<list.length;i++)
        {
            for(int j=0;j<list.length;j++)
            {
                if(list[i][j]>max1)
                {
                    max1=list[i][j];
                    p=i+1;
                    q=j+1;
                }
            }
        }
        System.out.println("largest no="+max1+"present at row="+p+"and column="+q);
        for(int i=0;i<list.length;i++)
        {
            for(int j=0;j<list.length;j++)
            {
                if(list[i][j]>max2&&list[i][j]!=max1)
                {
                    max2=list[i][j];
                    p=i+1;
                    q=j+1;
                }
            }
        }
        System.out.println("second largest element="+max2+"present at row="+p+"and column="+q);
    }
    //method to display
    public void display()
    {
         for(int i=0;i<list.length;i++)
        {
            for(int j=0;j<list.length;j++)
            {
                System.out.print(list[i][j]+" ");
            }
            System.out.println();
        }
    }
    //method to perform sorting in ascending order
    public void ascending(int list[])
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
    //function to sort row
    public void sort()
    {
        for(int i=0;i<list.length;i++)
        {
            ascending(list[i]);
        }
    }
    //main method
    public void main()
    {
        inputAndStore();
        System.out.println("original matrix");
        display();
        large();
        sort();
        System.out.println("matrix after sorting");
        display();
    }
}
        
            

                    
        
        
        
        
    
        
    