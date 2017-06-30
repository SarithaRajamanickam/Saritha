import java.util.*;
class ForEachEx
{
    public static void main(String[] args) {
        int a[]=new int[6];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        for(int arr:a)
        {
            System.out.println(arr);
        }
    }
}