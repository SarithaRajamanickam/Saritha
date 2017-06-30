import java.util.*;
abstract class AbstractClass
{
   abstract void display();
}
class Anonymousinner1Test extends AbstractClass
{
    void display()
        {
            System.out.println("This represents Anonymousinner class using abstract");
        }

public static void main(String args[])
   {
       AbstractClass  annonymousinner = new Anonymousinner1Test();
        annonymousinner.display();
    }
}

