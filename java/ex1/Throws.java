class Throws
{
   public static void throwMethod() throws ArithmeticException
   {
       System.out.println ("Inside throwMethod");
       throw new ArithmeticException ("Demo"); 
   } 
   public static void main(String args[])
   {
       try
       {
          throwMethod();
       }
       catch (ArithmeticException exp)
       {
          System.out.println ("The exception get caught"+exp);
       }
    }
}