class Exception4{
   public static void main(String args[]){
     try{
         int a[]=new int[7];
         a[8]=30/0;
         System.out.println("First print statement in try block");
     }
   
     catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Warning: ArrayIndexOutOfBoundsException");
     }
     catch(ArithmeticException e){
        System.out.println("Warning: ArithmeticException");
     }
     catch(Exception e){
        System.out.println("Warning: Some Other exception");
     }
   System.out.println("Out of try-catch block...");
  }
}