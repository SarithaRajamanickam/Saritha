    interface Printable{  
    void print();  
    }  
    interface Showable{  
    void print();  
    }  
      
    class Test implements Printable, Showable{  
    public void print(){System.out.println("Hello");}  
    public static void main(String args[]){  
    Test obj = new Test();  
    obj.print();  
     }  
    }  