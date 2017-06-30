class Exception5
{
        void fun() throws ArithmeticException
    {
         try{
              int b=10/0;
              System.out.println("hai");
              throw new ArithmeticException();
          }
          catch(ArithmeticException e)
          {
              System.out.println(e);
          }
          
    } 
     void add()
    {
        System.out.println("second method");
    }
      
    public static void main(String[] args) {
        Exception5 e=new Exception5();
        e.add();
        e.fun();
    }
}