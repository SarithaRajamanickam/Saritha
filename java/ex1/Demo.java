static class Demo
{
    static Demo()
    {
        System.out.println("static con");
    }
    public static void main(String args[])
    {
        Demo d=new Demo();
        d.Demo();
    }
}