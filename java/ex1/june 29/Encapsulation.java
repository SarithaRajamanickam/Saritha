class Person
{
void walk()
{
System.out.println("Can Run....");
}
}
class Encapsulation extends Person
{
void walk()
{
System.out.println("Running Fast...");
}
public static void main(String arg[])
{
Person p=new Encapsulation(); //upcasting
p.walk();
}
}