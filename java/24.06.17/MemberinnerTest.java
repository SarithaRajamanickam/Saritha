import java.util.*;
class MemberinnerTest
{
    private int a=10;
    class Inner{
        void display()
        {
            System.out.println("Value of a " +a);
        }
    }
    public static void main(String args[])
    {
        MemberinnerTest outer=new MemberinnerTest();
        MemberinnerTest.Inner inner=outer.new Inner();
        inner.display();
    }
}