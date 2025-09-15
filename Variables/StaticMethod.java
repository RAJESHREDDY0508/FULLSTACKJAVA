

class Mobile
{
    int price; //Instance variable
    String brand;  //Instance variable
    static String name;

        public void show()  //Instance Method
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    //STATIC METHOD
    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }

}



public class StaticMethod
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "samsung";
        Mobile.name = "SmartPhone";
        obj1.price = 1500;


        Mobile obj2 = new Mobile();
        obj2.brand = "Iphone";
        Mobile.name = "SmartPhone";
        obj2.price = 1700;

        obj1.name = "Foldable Phone";

        // obj1.show();
        // obj2.show();

        Mobile.show1(obj1);  //static method calling

    }
}