import java.util.*;
class Matrix
{
    int ar[][];
    public void displayMatrix()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows and columns");
        int m=sc.nextInt();
        int n=sc.nextInt();
        ar=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.println("enter the value of ar["+i+"]["+j+"]");
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("original matrix are=");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
    //method to sum
    public void displaySum()
    {
        int sum=0;
        int m=ar.length;
        int n=ar[0].length;
        if(ar.length==1&&ar[0].length==1)
        {
            sum=ar[0][0];
        }
        else if(ar.length==2&&ar[0].length==1)
        {
            sum=ar[0][0]+ar[1][0];
        }
        else if(ar.length==1&&ar[0].length==2)
        {
            sum=ar[0][0]+ar[0][1];
        }
        else
        {
            sum=ar[0][0]+ar[0][n-1]+ar[m-1][n-1]+ar[m-1][0];
        }
        System.out.println("sum="+sum);
    }
    //metod to sort
    public void sort()
    {
        
        int t;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[0].length-1;j++)
            {
                for(int k=0;k<ar[0].length-j-1;k++)
                {
                    if(ar[i][k]>ar[i][k+1])
                    {
                        t=ar[i][k];
                        ar[i][k]=ar[i][k+1];
                        ar[i][k+1]=t;
                    }
                }
            }
            i=ar.length-1;
        }
        for(int i=1;i<ar.length-1;i++)
        {
            for(int j=0;j<ar[0].length-1;j++)
            {
                for(int k=0;k<ar[0].length-j-1;k++)
                {
                    if(ar[i][k]<ar[i][k+1])
                    {
                        t=ar[i][k];
                        ar[i][k]=ar[i][k+1];
                        ar[i][k+1]=t;
                    }
                }
            }
            
        }
 System.out.println("after sorting  ");
 for(int i=0;i<ar.length;i++)
 {
     for(int j=0;j<ar[0].length;j++)
     {
         System.out.print(ar[i][j]+" ");
        }
        System.out.println();
    }
}
    //main method
    public void main()
    {
        displayMatrix();
        displaySum();
        sort();
    }
}

        
                
        