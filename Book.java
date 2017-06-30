package com.mycompany.app;

public class Book {

public Boolean display(int id,String name,String author,String publisher,int quantity)
{
    if(id==0)
    {
        return false;
    }
   return true;
} 
/*public String toString()
{
  return "id : " + id + ", name : " + name + ", author : " + author + ", publiser : " + publiser + ", quantity : "+ quantity;
}*/
}
