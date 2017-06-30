import java.util.ArrayList;
 
public class ArrayCol {
 
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("Random");
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("sublist:"+arrl.subList(1,3));
        System.out.println("Actual ArrayList:"+arrl);
        System.out.println("LastIndex:"+arrl.lastIndexOf("Random"));
        int b=arrl.size();
        String str[]=new String[b];
        arrl.toArray(str);
        for(String res:str)
        {
            System.out.println(res);
        }
        arrl.clear();
        System.out.println("After clear ArrayList:"+arrl);
    }
}
