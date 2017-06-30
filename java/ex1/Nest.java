class Nest
{
    public static void main(String[] args) {
        int a=10,b;
        try{
            try{
               b=10/0;
            }
            catch(Exception e)
            {
               System.out.println("first"+e);
            }
            try{
                b=23/0;
            }
            catch(Exception e)
            {
                System.out.println("second"+e);
            }
        }
        catch(Exception e)
        {
            System.out.println("nest"+e);
        }
        
    }
}