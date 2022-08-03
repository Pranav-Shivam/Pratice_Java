import java.util.*;
class All_In_one
{
    public static void main(String a[])
    {
        Base objb=new Base();               //objects
        Base ob=new Base(15);
        Derived objd=new Derived();
        ob.display();
        ob.display(25);
        ob.show();
        System.out.println(" ____________");
        objb.display();
        objb.display(25);
        objb.show();
        System.out.println(" ____________");
        objd.display();
        objd.show();
    }
}