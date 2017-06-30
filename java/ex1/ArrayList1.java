import java.util.ArrayList;
class ArrayList1
{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(15);
        a.add(1,20);
        a.add(19);
        a.set(1,12);
        System.out.println(a);
        System.out.println("Element of second pos: "+a.get(2));
        System.out.println(a.contains(19));
        System.out.println("Is Empty: "+a.isEmpty());
        System.out.println("size of array: "+a.size());
        System.out.println("Index of element: "+a.indexOf(15));
         System.out.println("remove element:"+a.remove(2));
        System.out.println(a);
    }
}