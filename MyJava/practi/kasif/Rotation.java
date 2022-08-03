import java.util.*;
class Rotation
{
    //method to rotate matrix 
    public void rotate()
    {
        int m,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of m");
        m=sc.nextInt();
        int a[][]=new int[m][m];
        if(m<2||m>10)
        {
            System.out.println("size is invalid");
        }
        else
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.println("enter the element of a["+i+"]["+j+"]");
                    a[i][j]=sc.nextInt();
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
            System.out.println("matrix after rotation");
            for(int j=0;j<m;j++)
            {
                for(int i=m-1;i>=0;i--)
                {
                    System.out.printf("%5d",a[i][j]);
                }
                System.out.println();
            }
            sum=a[0][0]+a[0][m-1]+a[m-1][0]+a[m-1][m-1];
            System.out.println("sum of corner elements="+sum);
        }
    }
}
                    
                        

            
                   
                
    