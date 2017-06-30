import java.util.*;
class DecimalToBinary
{
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
       int num=s.nextInt();
      int b[] = new int[40];
      int len=b.length;
      int pos = 0;
     while(num !=0){
       int rem = num%2;
       b[pos]=rem;
       pos++;
    //   System.out.println(b[pos]);
       num = num/2;
     }
    for(int j=pos-1;j>=0;j--)
     {
         System.out.println(b[j]);
     }
   }
}