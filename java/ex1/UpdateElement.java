import java.util.Scanner;

class UpdateElement
{
    public static void main(String[] args) {
        int count=0;
        String a[]=new String[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextLine();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
               if(a[i]==a[j])
               {
                   count++;
                  
                   break;
                
               } a[i]=a[j];
               System.out.println(a[i]);
              }
        }
       if(count>1)

       {
           System.out.println("ff");
       }
       for(int i=0;i<a.length-count;i++)
       {
        System.out.println("output is"+a[i]);
       }
       
    }

}