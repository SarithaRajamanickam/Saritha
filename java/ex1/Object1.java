abstract class Creation1
{
    abstract void method(int a);
}
class Object1 
{
    
    public static void main(String[] args) {
   
    Creation1 c=new Creation1()
    { 
      void method(int a)
     {
         System.out.println("method called"+a);
     }
    };
    c.method(12);
}
}