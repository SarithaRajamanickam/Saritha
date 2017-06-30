import java.util.*;

class Imp implements Interfacedao 
{   
    
    List<Employee> employee;
    public Imp()
    {
    employee=new ArrayList<Employee>();
    Employee e=new Employee(1,"saritha");
    Employee e1=new Employee(2,"subi");
    employee.add(e);
    employee.add(e1);
    }
    public List<Employee> allemployee()
    {
     return employee;   
    }
    public void updateEmployee(Employee employee)
    {
      
        if(employee.getId()==1)
        {
            employee.setName(Employee.getName());
        }
         //students.get(student.getRollNo()).setName(student.getName());
    }

        
}