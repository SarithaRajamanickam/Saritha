import java.util.*;
class College
{
  private String instName;
  List<Department> departments;
  College(String instName,List<Department> departments)
  {
      this.instName=instName;
      this.departments=departments;
  }
  public int getNoOfStudents()
  {
      int noOfStudents=0;
      List<Student> students;
      for(Department depart:departments)
      {
         students=depart.getStudents();
         for(Student std:students)
         {
             noOfStudents++;
         }
      }
      return noOfStudents;
  }
}