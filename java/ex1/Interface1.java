interface Car
{
    String car_color="red";
    void price(int price);
}
class Interface1 implements Car{
    String car_name;
    int price;
    void setName(String car_name)
    {
        this.car_name=car_name;
    }
   public void price(int price)
    {
        this.price=price;
    }
    public String toString()
    {
        return car_name+"  "+car_color+" "+price;
    }

   public static void main(String[] args) {
       Interface1 i=new Interface1();
       i.setName("tata");
       i.price(12345);
       System.out.println(i);
   }

}
