import java.util.*;
class Department
{
    private String deptName;
    List<Student> students;
    Department(String deptName,List<Student> students)
    {
        this.deptName=deptName;
        this.students=students;
    }
    public  List<Student> getStudents()
    {
        return students;
    }

}