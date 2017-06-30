class Throw3
{
     public void method(int a,int b)
        {
            if(a==b)
            {
              throw new ArithmeticException("Exception in Throw");
             }
             else{
                  System.out.println(" NOT VALID");
             }
        }
    public static void main(String[] args) {
      Throw3 t=new Throw3();
        t.method(23,23);
        System.out.println("Exce");
    }
}