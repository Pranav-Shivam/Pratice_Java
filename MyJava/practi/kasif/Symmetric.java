import java.util.*;
class Symmetric
{
    private int a[][];
    //default constructor
    Symmetric()
    {
        a=null;
    }
    //method to display and check as instructed
    public void displaySymmetric()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of row or column");
        int m=sc.nextInt();
        if(m>1&&m<=10)
        {
            a=new int[m][m];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.println("enter the element of a["+i+"]["+j+"]");
                    a[i][j]=sc.nextInt();
                }
            }
            int k=1;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(a[i][j]!=a[j][i])
                    {
                        k=0;
                        break;
                    }
                }
            }
            System.out.println("original matrix");
             for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.printf("%5d",a[i][j]);
                }
                System.out.println();
            }
            if(k==1)
            {
                System.out.println("the given matrix is symmetric");
            }
            else
            {
                System.out.println("the given matrix is not symmetric");
            }
            System.out.print("sum of left diagonal=");
            int sum1=0;
            for(int i=0;i<m;i++)
            {
                sum1=sum1+a[i][i];
            }
            System.out.println(sum1);
            System.out.print("sum of right diagonal=");
            int sum2=0;
            int j=2;
            for(int i=0;i<m;i++)
            {
                sum2=sum2+a[i][j];
                j--;
            }
            System.out.println(sum2);
        }
        else
        {
            System.out.println("invalid input");
        }
    }
}
            
                    
            
            
                