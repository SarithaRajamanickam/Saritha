class Membercls
{
    class Anothercls{
            public void methodName()
            {
                System.out.println("inner class");
            }
    }
    public static void main(String[] args) {
    Membercls cls=new Membercls();
    Membercls.Anothercls an=cls.new Anothercls();
    an.methodName();
    }
}