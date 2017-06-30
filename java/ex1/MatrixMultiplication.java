import java.util.*;
class MatrixMultiplication
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int d[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               a[i][j]=s.nextInt();
               b[i][j]=s.nextInt();
              
            }
        }
   
       for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               c[i][j]=a[i][j]+b[i][j];
               System.out.println("output is :"+ c[i][j] +"\t");
            }
           System.out.println("\n");
        }
         
    /* for(int c=0; c<3; c++)
         {
            for(d=0; d<3; d++)
            {
               System.out.print([c][d] + "\t");
            }
            System.out.print("\n");
         }*/
      }


    }
