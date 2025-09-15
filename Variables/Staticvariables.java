

class Mobile
{
    int price; //Instance variable
    String brand;  //Instance variable
    static String name;

        public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

}



public class Staticvariables
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

        obj1.show();
        obj2.show();

    }
}