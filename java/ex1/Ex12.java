class Ex12
{
    public void display()
    {
        System.out.println("first");
    }
}
class Ex13 extends Ex12
{
    public void display()
    {
        System.out.println("second");
    }
}
class Ex14 extends Ex13
{
    public void display()
    {
        System.out.println("third");
    }
        public static void main(String[] args) {
        
            super.display();
        }
}