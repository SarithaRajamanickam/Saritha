class Student
{
String name;
int rollno;
int age;

public String getName() {
        return name;
    }
public int getRollno()
{
    return rollno;
}
public int getAge()
{
    return age;
}
    public void setName(String name,int rollno,int age) {
        this.name = name;
        this.rollno = rollno;
        this.age=age;
        
    }

public void displayName(){
System.out.println(getName());
System.out.println(getRollno());
System.out.println(getAge());

}

public String toString() {
    return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
}
}
class StudentTest1{
public static void main(String args[]){
Student std=new Student();
std.name="John";
std.rollno=1234;
std.displayName();

Student std1=new Student();
std1.name="Johncy";
std1.displayName();


System.out.println(std);

}
}

