class First
{
    int num=1;
}
class VarInherit extends First{
    int num=5;
    public static void main(String[] args) {
       // VarInherit s1=new VarInherit();
        First s1=new First();
        s1=new VarInherit();
        System.out.println(s1.num);
        System.out.println(s1.num);
    }
}