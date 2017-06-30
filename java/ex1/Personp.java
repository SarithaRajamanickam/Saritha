abstract class Personp
   {String name;
    String gender;
void welcome()
{
    System.out.println("hai");
}
abstract void work();
Personp(String name,String gender)
{
    this.name=name;
    this.gender=gender;

}
public String toString()
{
    return ("name: "+name+" gender: "+gender);

}

}