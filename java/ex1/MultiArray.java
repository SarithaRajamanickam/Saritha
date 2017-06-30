import java.util.*;
class MultiArray
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[][][]=new int[3][3][3];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                for(int k=0;k<a.length;k++)
                {
                a[i][j][k]=s.nextInt();
                System.out.println(a[i][j][k]);
            }
            }
        }
    }
}