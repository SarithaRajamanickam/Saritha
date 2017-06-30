    class TestOuter1{ 
        private int a=10; 
      static int data=30;  
      static class Inner{  
       void msg(){System.out.println("data is "+data);}  
      }  
      public static void main(String args[]){  
      TestOuter1.Inner obj=new TestOuter1.Inner();  
      obj.msg();  
      }  
    }  