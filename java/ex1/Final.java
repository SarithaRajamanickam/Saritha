class Final
{
   public static int myMethod()
   {
       try {
            //try block
            System.out.println("hai");
            return 18;
            
       }
      /* catch(Exception e)
       {
           System.out.println(e);
       }*/
       finally {
            //finally
            System.out.println("Inside Finally block");
            return 19;
       }
       
  }
  public static void main(String args[])
  {
       System.out.println(Final.myMethod());
  }
}