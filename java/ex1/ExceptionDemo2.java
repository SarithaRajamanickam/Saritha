class ExceptionDemo2
{
    public static void main(String[] args) {
    int a[]=new int[10];
    try 
        {
           a[11]=23;
    } catch (Exception e) {
        System.out.println(e);
    }
    finally
    {
        System.exit(100);
        System.out.println("sdasfaf");
        
    }
      
}
}