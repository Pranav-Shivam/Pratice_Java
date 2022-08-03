import java.util.*;
public class Ab
{ 
    int a,b;
    Ab()
    {
        a=0;
        b=0;
    }
    public void getData(int x,int y)
    {
        a=x;
        b=y;
    }
    public void putData()
    {
        System.out.println("A = "+a+" B = "+b);
    }
}
