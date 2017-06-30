public class ThrowEx {
   static void checkEligibilty(int stuage, int stuweight) throws ArithmeticException{ 
     try{

     if(stuage<12 && stuweight<40) {
         System.out.println("good");
         throw new ArithmeticException("Student is not eligible for registration"); 
         
      }
      else {
         System.out.println("Entries Valid"); 
      }
     }
 catch(ArithmeticException e)
 {
     System.out.println("hai"+e);
 }
   } 
//lass ThrowEx{
       public static void main(String args[]){ 
          // sss s=new sss();
     System.out.println("Welcome to the Registration process");
     checkEligibilty(10, 39); 
     System.out.println("Have a nice day"); 
 } 
}