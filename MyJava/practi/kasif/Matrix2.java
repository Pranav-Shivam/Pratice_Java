import java.util.*;
class Matrix2
{
    Scanner sc=new Scanner(System.in);
    int ar[][];
    //fn to input and store
    public void inputAndStore()
    {
        System.out.println("Enter the no.for row and column");
        int n=sc.nextInt();
        ar=new int[n][n];
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[0].length;i++)
            {
                System.out.println("Enter the no.for position ["+i+"]["+j+"]");
                ar[i][j]=sc.nextInt();
            }
        }
    }
    
