import java.util.*;

class Aggregation
{
    public static void main(String[] args) {
        Student s1=new Student(1,"saritha","cse");
        Student s2=new Student(2, "sindhuja","eee");
        List<Student> cse=new ArrayList<Student>();
        cse.add(s1);
        List<Student> eee=new ArrayList<Student>();
        eee.add(s2);
        Department d1=new Department("cse", cse);
        Department d2=new Department("eee", eee);
        List<Department> de1=new ArrayList<Department>();
        de1.add(d1);
        de1.add(d2);
        College c1=new College("KSR",de1);
        System.out.println("no of students: "+c1.getNoOfStudents());

        
    }
}