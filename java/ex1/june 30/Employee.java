class Employee
{
    private int empid;
    private String name;
    Employee(int empid,String name)
    {
        this.empid=empid;
        this.name=name;
    }
    public void setId(int empid)
    {
        this.empid=empid;
    }
    public int getId()
    {
        return empid;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
  /*  public String toString()
    {
        return empid+" "+name;
    }*/ 
}