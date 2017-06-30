import java.util.*;
class Update
{
    public static void main(String[] args) {
  
    int n,pos,element;
   
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the elements");
    n=sc.nextInt();
     int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
     a[i]=sc.nextInt();
    }
    System.out.println("enter the element to update");
    element =sc.nextInt();
    System.out.println("enter the position");
    pos=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      if(i==pos)
    {
    a[i]=element;
    //System.out.println(a[i]);
    }
    }
   for(int i=0;i<n;i++)
    {
        System.out.println("output:"+a[i]);
    }

}
}