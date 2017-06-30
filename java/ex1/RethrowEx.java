class RethrowEx
{
    public static void studentName()
    {
      try{   
          String str=null;
          throw new NullPointerException();
          
      }
      catch(NullPointerException e)
      {
          System.out.println(e);
          throw e;//rethrow
      }
   //  System.out.println("catch after"); 
    }
    public void additionalmethods()
    {
        System.out.println("additional methods run");
    }
    public static void main(String[] args) {
        try{
             studentName();
           }
        catch(NullPointerException e)
        {
          System.out.println("last"+e);
        }
        RethrowEx e=new RethrowEx();
        e.additionalmethods();

    }
}