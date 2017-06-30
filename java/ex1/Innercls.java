import java.util.*;
interface TestInterface
{
    void display();
}
class Innercls implements TestInterface
{
        public void display()
        {
            System.out.println("Anonymous Inner class using interface");
        }
    public static void main(String args[])
    {
        // difference from normal interface 
        //TestInterface interfaceobject = new TestInterface()
       // {

   // };
    //calling of interface
    //interfaceobject.display();
    Innercls i=new Innercls();
    i.display();
    }
}