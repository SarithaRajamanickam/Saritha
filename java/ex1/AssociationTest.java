
abstract class Person
{
String name;
String gender;
void welcome(){
System.out.println("concrete method");
}
abstract void work();
Person(String name,String gender)
{
this.name=name;
this.gender=gender;
}
public String toString()
{
return (name+" "+gender);
}
}

****************************

class Employee extends Person
{
int employeeid;
Employee(int id,String name,String gender)
{
super(name,gender);
this.employeeid=id;
//this.name=name;
//this.gender=gender;
}
Employee (String name,String gender)
{
super(name,gender);
}

public void work()
{
if(employeeid>=1 && employeeid<5)
{
System.out.println("employee");
}
else if(employeeid>=5)
{
System.out.println("student");
}

else if (employeeid == 0)
{
System.out.println(employeeid+"guest");
}

//System.out.println("abstract method");
}
public String toString()
{
return (employeeid+" "+name+" "+gender);
}

public void welcome()
{
System.out.println("overided");
}
public static void main(String args[])
{
Person emp=new Employee(01,"santhosh","male");
Person emp1=new Employee(02,"nirmal","male");
Person emp2=new Employee("sir","male");
System.out.println(emp);
System.out.println(emp1);
System.out.println(emp2);
emp.work();
emp.welcome();
emp1.work();
emp1.welcome();
emp2.work();
emp2.welcome();
}
}

From: "Baraneetharan Ramasamy" <baraneetharan.ramasamy@kgfsl.com>
To: "vanitha v" <vanitha.v@kggroup.com>, "saritha r" <saritha.r@kggroup.com>, "subitha m" <subitha.m@kggroup.com>, "sindhuja r" <sindhuja.r@kggroup.com>, "switha c" <switha.c@kggroup.com>, "ajithkumar p" <ajithkumar.p@kggroup.com>, "suriyan s" <suriyan.s@kggroup.com>, "koyel rana" <koyel.rana@kggroup.com>, "poovarasan g" <poovarasan.g@kggroup.com>, "krishna d" <krishna.d@kggroup.com>, "preethi s" <preethi.s@kggroup.com>, "dhivya r" <dhivya.r@kggroup.com>, "aruna c" <aruna.c@kggroup.com>, "mohanapriya p" <mohanapriya.p@kggroup.com>, "vijayabaskar p" <vijayabaskar.p@kggroup.com>, "hemachandiran k" <hemachandiran.k@kggroup.com>, "vengatesan n" <vengatesan.n@kggroup.com>, "divyadharshini g" <divyadharshini.g@kggroup.com>, "manisha m" <manisha.m@kggroup.com>, "brightymartina m" <brightymartina.m@kggroup.com>, "deepika m" <deepika.m@kggroup.com>, "sabari k" <sabari.k@kggroup.com>, "santhoshkumar a" <santhoshkumar.a@kggroup.com>, "buvaneshwari b" <buvaneshwari.b@kggroup.com>, "kausalya sp" <kausalya.sp@kggroup.com>, "naveen m" <naveen.m@kggroup.com>, "nirmalkumar m" <nirmalkumar.m@kggroup.com>, "vijayakumar n" <vijayakumar.n@kggroup.com>, "akshaya pr" <akshaya.pr@kggroup.com>, "mahendran i" <mahendran.i@kggroup.com>, "sathyamoorthy ravichandran" <sathyamoorthy.ravichandran@kggroup.com>, "ramya s" <ramya.s@kggroup.com>
Sent: Friday, June 16, 2017 1:02:22 PM
Subject: Re: Inheritance | Association | Composition


import java.util.*;

class CompositionTest{
public static void main(String[] args) {
Student student1=new Student(1, "Student1", "Department1");
Student student2=new Student(2, "Student2", "Department1");
Student student3=new Student(3, "Student3", "Department1");

List<Student> students=new ArrayList<Student>();
students.add(student1);
students.add(student2);
students.add(student3);

Department dept=new Department("Department", students);

List<Student> stu=dept.getStudents();
for (Student s:  stu) {
System.out.println(s.getRollno()+" "+s.getName()+" "+s.getDepartment());
}

}
}

From: "Baraneetharan Ramasamy" <baraneetharan.ramasamy@kgfsl.com>
To: "vanitha v" <vanitha.v@kggroup.com>, "saritha r" <saritha.r@kggroup.com>, "subitha m" <subitha.m@kggroup.com>, "sindhuja r" <sindhuja.r@kggroup.com>, "switha c" <switha.c@kggroup.com>, "ajithkumar p" <ajithkumar.p@kggroup.com>, "suriyan s" <suriyan.s@kggroup.com>, "koyel rana" <koyel.rana@kggroup.com>, "poovarasan g" <poovarasan.g@kggroup.com>, "krishna d" <krishna.d@kggroup.com>, "preethi s" <preethi.s@kggroup.com>, "dhivya r" <dhivya.r@kggroup.com>, "aruna c" <aruna.c@kggroup.com>, "mohanapriya p" <mohanapriya.p@kggroup.com>, "vijayabaskar p" <vijayabaskar.p@kggroup.com>, "hemachandiran k" <hemachandiran.k@kggroup.com>, "vengatesan n" <vengatesan.n@kggroup.com>, "divyadharshini g" <divyadharshini.g@kggroup.com>, "manisha m" <manisha.m@kggroup.com>, "brightymartina m" <brightymartina.m@kggroup.com>, "deepika m" <deepika.m@kggroup.com>, "sabari k" <sabari.k@kggroup.com>, "santhoshkumar a" <santhoshkumar.a@kggroup.com>, "buvaneshwari b" <buvaneshwari.b@kggroup.com>, "kausalya sp" <kausalya.sp@kggroup.com>, "naveen m" <naveen.m@kggroup.com>, "nirmalkumar m" <nirmalkumar.m@kggroup.com>, "vijayakumar n" <vijayakumar.n@kggroup.com>, "akshaya pr" <akshaya.pr@kggroup.com>, "mahendran i" <mahendran.i@kggroup.com>, "sathyamoorthy ravichandran" <sathyamoorthy.ravichandran@kggroup.com>, "ramya s" <ramya.s@kggroup.com>
Sent: Friday, June 16, 2017 11:21:20 AM
Subject: Inheritance | Association |


class College {
private String name;

College(String name) {
this.name = name;
}

public String getName() {
return name;
}
}

***********************

class Student {
private String name;

Student(String name) {
this.name = name;
}

public String getName() {
return name;
}

}

****************************

class AssociationTest {

public static void main(String[] args) {
College college = new College("KSR");
Student student = new Student("John");
System.out.println(student.getName() + " is a student of " + college.getName() + " college");
}
}



