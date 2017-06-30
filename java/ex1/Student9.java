class Student9{  
     int rollno;  
     String name;  
     static String college = "ITS";  
     static String InstPlace="cbe";
     static void change(){  
     college = "BBDIT";  
     }  
  
     Student9(int r, String n){  
     rollno = r;  
     name = n; 
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college+" "+InstPlace);}  
  
    final strictfp public static void main(String... args){  
      change();  
  
    Student9 s1 = new Student9 (111,"Karan");  
    Student9 s2 = new Student9 (222,"Aryan");  
    Student9 s3 = new Student9 (333,"Sonoo");  
  
    s1.display();  
    s2.display();  
    s3.display(); 
     
    }  
}  