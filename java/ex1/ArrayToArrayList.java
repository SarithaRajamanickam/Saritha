import java.util.*;
class ArrayToArrayList
{
    public static void main(String[] args) {
        String name[]={"saritha","sindhuja"};
        ArrayList<String> list1=new ArrayList<String>(Arrays.asList(name));
        Book1 b1=new Book1("c","abc");
        Book1 b2=new Book1("java","ccc");
        List<Book1> list2=new ArrayList<Book1>();
        list2.add(b1);
        list2.add(b2);
        ArrayList<String> list3=new ArrayList<String>();
        for (Object obj : list2) {
            list3.add(obj.toString());
           // System.out.println(obj);
           // list3.add(obj);
        }
        list3.addAll(list1);
        //list3.addAll()
        System.out.println(list3);

    
    }
}