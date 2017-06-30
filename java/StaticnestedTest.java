import java.util.*;
class StaticnestedTest{  
  static int data=30;  
  static class Inner{  
   void msg(){System.out.println("data is "+data);}  
  }  
  public static void main(String args[])
  {  
  StaticnestedTest.Inner obj=new StaticnestedTest.Inner();  
  obj.msg();  
  }  
}  