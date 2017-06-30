class Singleton1
{
    private static Singleton1 obj=new Singleton1();
    private Singleton1(){}  
   
 public static Singleton1 getA(){  
  return obj;  
 }  
  
 public void doSomething(){  
 //write your code  
 }  
}  
