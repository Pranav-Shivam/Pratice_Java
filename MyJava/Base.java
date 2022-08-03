import java.util.*;
class Base
{
    int a;                          //instance variable
    Base()                          //default constructor
    {
        a=0;
    }
    Base(int x)                     //parameterised constructor and constructor overloading
    {
        a=x;
    }
    public void display()           //method 
    {
        System.out.println("A = "+a);
    }
    public void display(int y)      //method overloading
    {
        int sum=a+y;
        System.out.println("Sum = "+sum);
    }
    public void show()              //method overriding
    {
        System.out.println("Base show");
    }
}