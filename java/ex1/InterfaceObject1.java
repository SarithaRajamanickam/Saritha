interface Test
 {
  void welcome();
 }
 public class InterfaceObject1
 {
    public static void main(String...a)
  {
     Test t=new Test()
    {
      public void welcome()
    {
      System.out.println("welcome");
     }
  };
t.welcome();
}
}