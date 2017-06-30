class Book1
{
    String bookName;
    String authorName;
    Book1(String bookName,String authorName)
    {
        this.bookName=bookName;
        this.authorName=authorName;
    }
    public String toString()
    {
        return ("name: "+bookName+"  author: "+authorName);
    }

}