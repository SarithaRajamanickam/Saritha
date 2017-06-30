import java.util.ArrayList;
import java.util.Collections;
class ArrayEx2
{
    public static void main(String[] args) {
        ArrayList arr1=new ArrayList();
        arr1.add("1");
        arr1.add("2");
        arr1.add("3");
        arr1.add("4");
        ArrayList arr2=new ArrayList();
        arr2.add("one");
        arr2.add("two");
        Collections.copy(arr1,arr2);
        System.out.println(arr1);
    }

        
}