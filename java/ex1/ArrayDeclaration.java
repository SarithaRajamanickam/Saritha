 import java.util.*;
 class ArrayDeclaration
{
     void arrayDisplay(int a[])
    {
      for(int i=0;i<5;i++)
      {
        
        System.out.println("printed values :"+a[i]);  
      }
      
    }
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the numbers:");
     int []a;
    a=new int[10];
    
    for(int j=0;j<a.length;j++)
    {
        a[j]=s.nextInt();
    }
    ArrayDeclaration obj=new ArrayDeclaration();
    obj.arrayDisplay(a);    
    }
    
}