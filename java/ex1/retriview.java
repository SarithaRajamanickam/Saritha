import java.util.*;
class retrieve
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLine();
        }
        System.out.println("Enter the element to retrieve: ");
    }
}