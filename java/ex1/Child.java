class Parent
{
    public Parent()
    {
        System.out.println("Parent class no-args constructor called");
    }
    public Parent(String name)
    {
        System.out.println("Parent class Parameterized constructor called by "+name);
    }
}
public class Child extends Parent
{
    public Child()
    {
        this("JIP");
        System.out.println("Child class no-args constructor called");
    }
    public Child(String name)
    {
        super("JIP");
        System.out.println("Child class Parameterized constructor called by "+name);
    }
    public static void main(String args[])
    {
        Child c = new Child();
    }
}