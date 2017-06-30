import java.util.*;
public class Book
{
 private int id;
 private String name;
 private String author;
private String publiser;
private int quantity;

public Book setid(int id)
{
 this.id=id;
 return this;
}
public Book setName(String name)
{
 this.name=name;
 return this;
}
public Book setAuthor(String author)
{
 this.author=author;
 return this;
}
public Book setPubliser(String publiser)
{
 this.publiser=publiser;
 return this;
}
public Book setQuantity(int quantity)
{
 this.quantity=quantity;
 return this;
}
public Book1 getbook() {
        return new Book1(id, name, author, publiser, quantity);
    }
 }