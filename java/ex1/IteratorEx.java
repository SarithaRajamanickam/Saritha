import java.util.Iterator;
import java.util.*;
class IteratorEx
{
    public static void main(String[] args) {
        ArrayList<String> arr1=new ArrayList<String>();
        arr1.add("saritha");
        arr1.add("subi");
        arr1.add("sindhu");
        arr1.add("mathu");
        Iterator<String> ar=arr1.iterator();
        while(ar.hasNext())
        {
            System.out.println(ar.next());
        }
        {

        }
        
    }
}