import java.util.*;
class Derived extends Base
{
    int b;                      //instance variable
    Derived()                   //constructor
    {
        super(10);
        b=5;
    }
    public void display()       //method
    {
        super.display();
        super.display(20);
        System.out.println("B = "+b);
        
    }
    public void show()          //method overriding
    {
        System.out.println("Derived show");
    }
}