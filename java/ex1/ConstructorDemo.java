class ConstructorDemo
{   String name;
     String id;
    ConstructorDemo(String name)
    {
         
       System.out.println(name);
    }
    ConstructorDemo(String name,String id)
    {
       
     this(name);
      System.out.println(id);

    }
    public static void main(String args[])
    {
        ConstructorDemo demo=new ConstructorDemo("saritha","13cs035");
      
    }
}