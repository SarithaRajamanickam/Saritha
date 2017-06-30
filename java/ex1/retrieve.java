import java.util.*;
class retrieve
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to retrieve: ");
        int element=sc.nextInt();
        for(int i=2;i<5;i++)
        {
            /*if(a[i]==element)
            {*/
                System.out.println("Retrieve element:"+a[i]);
           /* }
            else
            {
                System.out.println("Element is not found");
            }*/
        }

    }
}