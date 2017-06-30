public class cmd 
{    static int c;
     public  static int add(int a)
    {
        System.out.println(a);
        return a;
     
    }
    public static int add(int a,int b)
    {
        c=a+b;
        return c;
    }
    public static void main(String args[])
    {
        add(1);
        add(23,34);
    }
}
