class Student
{
String name;
int rollno;
int age;
boolean test;
public String getName() {
        return name;
    }
    public boolean getbool()
    {
        return test;
    }

    public void setName(String name) {
        this.name = name;
    }
 public boolean setbool(boolean test)
 {
     this.test=test;
 }   
public void displayName(){
System.out.println(getName());
}

public String toString() {
    return "Student [name=" + name + ", rollno=" + rollno +",test="+test +", age=" + age + "]";
}
final void example()
{
    System.out.println("hi final");
}
}
class StudentTest{
public static void main(String args[]){
Student std=new Student();
std.name="John";
std.displayName();

Student std1=new Student();
std1.name="Johncy";
std1.displayName();


System.out.println(std);

}
}

