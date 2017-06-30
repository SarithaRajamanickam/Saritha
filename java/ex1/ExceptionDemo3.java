class ExceptionDemo3
{
    public static void main(String[] args) {
        String str;
        try{
             str=Integer.parseInt("123");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}