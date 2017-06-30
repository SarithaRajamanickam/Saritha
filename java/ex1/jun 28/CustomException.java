class MyException extends Exception
{
    MyException(String s)
    {
        super(s);
    }
}
    class CustomException
    {
        
    public void method() 
    {   try
        { 
         int empid=3;
        if(empid>1&&empid<8)
           {
              System.out.println("valid EmployeeId");
             throw new MyException("user defined Exception");
            }
    else{
        System.out.println("Not a valid EmployeeId");
       }
        }
        catch(MyException ex)
        {
            System.out.println("my exception"+ex.getMessage());
           // throw ex;
        }
       /* try{
            
        }
        catch(MyException et)
        {
            System.out.println("sec"+et);
        }*/
    }
    public static void main(String[] args) {
         CustomException c=new CustomException();
          c.method();
       /*  try
         {
            
         }
         catch(MyException e)
         {
             System.out.println("exception"+e.getMessage());
         }*/
        
    }
}