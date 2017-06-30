public class Person1 {
 String name;
private String gender;

Person1(String name, String gender){
    this.name = name;
    this.gender = gender;

}
public void setName(String name){
    this.name = name;
}
public void setGender(String gender){
    this.gender = gender;
}

public String getName(){
    return name;
}
public String getGender(){
    return this.gender;
}

public static void main(String[] args)
{
   Person1 me = new Person1("saritha","female");
   Person1 me1 =new Person1("sindhu","female");
    System.out.println("My name is:" + me.name);
   // me.setName("OtherName");
  // System.out.println("My name is:" + me.getName());
}
}