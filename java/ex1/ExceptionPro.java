class ExceptionPro
{
    void A()
    {   int b=10/0;
        System.out.println("a");
        B();
    }
    void B()
    {
        C();
    }
    void C()
    {
        try{
             A();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        ExceptionPro p=new ExceptionPro();
        p.C();
    }
}