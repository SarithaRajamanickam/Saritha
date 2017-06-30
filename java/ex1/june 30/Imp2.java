import java.util.*;
class Imp2{
    public static void main(String[] args) {
       
        Interfacedao i=new Imp();
        for(Employee employee:i.allemployee())
        {
            System.out.println(employee.getId()+" "+employee.getName());
        }
        i.updateEmployee(employee);
        
    
    }
}