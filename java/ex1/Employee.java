class Employee extends Personp
{
    int empid;
    
    Employee(int id,String name,String gender)
    {
        super(name,gender);
        this.empid=id;
      
    }void welcome()
{
    System.out.println("hello");
}
    void work()
    {
        System.out.println("abstract");
    }
}