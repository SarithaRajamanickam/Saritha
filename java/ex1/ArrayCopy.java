import java.util.*;
class ArrayCopy
{
    public static void main(String[] args) {
        ArrayList<String> arr1=new ArrayList<String>();
        arr1.add("a");
        arr1.add("b");
        ArrayList<String> arr2=new ArrayList<String>();
        arr2.add("c");
        arr2.add("d");
        arr1.addAll(arr2);
        System.out.println(arr1);
    }
}