    class B{  
      
      final void method()
      {
          System.out.println("final is called");
      } 
     
    }
    class A extends B{
        // static int a=40; 
      //System.out.println(a);   
     public static void main(String args[]){  
      A a=new A();
      a.method();
    }       
 }