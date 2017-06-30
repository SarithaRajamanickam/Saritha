import java.io.*;
class FileCreate{
    public static void main(String[] args) {
        try{
        File f=new File("D:\\myfile.txt ");
        
        boolean b=f.createNewFile();
        boolean c=f.renameTo("D:\\my.txt");
        if(c){
            System.out.println("file created");
        }
        else{
            System.out.println("already exist");
        }
        
    }
    catch(IOException e){
System.out.println("error occured");
e.printStackTrace();
}        
    }
    
}