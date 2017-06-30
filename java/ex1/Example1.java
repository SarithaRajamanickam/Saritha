class Checkmain{
public static void main(String args[]){

System.out.println("hello ");
}
}
class Checkmain1 extends Checkmain{
public static void main(String args[]){
System.out.println("how r u");
}

}
class Example1{
public static void main(String args[]){

String name[]=new String[10];
Checkmain.main(name);
Checkmain1.main(name);
}}