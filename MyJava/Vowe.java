import java.util.*;
class Vowe
{

    int [][]ar=null;

    void inputAndStore()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("enter the value of no. of rows");
        int r=scr.nextInt();
        System.out.println("enter the value of no. of collumn");
        int c=scr.nextInt();
        
        ar =new int[r][c];
        
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[0].length;j++)
            {
                System.out.println("enter the value of "+(i+1)+(j+1));
                ar[i][j]=scr.nextInt();
            }
        }

    }

    void display()
    {
        for(int i=0;i<ar.length;i++)
        {
            int k=ar[0].length-1;
            for(int j=0;j<ar[0].length;j++)
            {      
                
                System.out.print(ar[i][k]);
                k--;
            }
            System.out.println();
        }
    }

    void main()
    {
        inputAndStore();
        display();
    }
}
