import java.util.*;
class ArrayEx3
{
    public static void main(String[] args) {
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        ArrayList<String> ar=(ArrayList<String>) arrl.clone();
        System.out.println(ar);
    }
}