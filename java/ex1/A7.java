    interface Printable{  
    void print(); 
   // void show(); 
    }  
    interface Showable{  
    void show();  
    }  
    class A7 implements Printable,Showable{  
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
    // public void show(){System.out.println("Welhhhhhhhhhhh");}  
      
    public static void main(String args[]){  
    A7 obj = new A7();  
    obj.print();
   // obj.show1();  
    obj.show();  
     }  
    }  