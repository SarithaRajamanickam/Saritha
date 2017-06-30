class LocalinnerTest{
    private int a=10;
    
    void display()
    {
        //class is created within the method
        class Local
        {
            void disp()
            {
                System.out.println("Program for local inner class");
                System.out.println("Value of a " +a);
            }
        }
        Local local = new Local();
        local.disp();
    }
    public static void main(String args[])
    {
        LocalinnerTest localinnertest = new LocalinnerTest();
        localinnertest.display();
    }
    
}

