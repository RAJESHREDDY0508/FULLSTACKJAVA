class Mobile
{
    int price; //Instance variable
    String brand;  //Instance variable
    static String name;

    static   //STATIC BLOCK
    {
        name = "Phone";
        System.out.println("In static block");
    }


    public Mobile()  //Constructor
    {
        brand = "";
        price = 200;
        System.out.println("In Constructor");
    }
}

public class StaticBlock
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        // Mobile obj1 = new Mobile();
        // obj1.brand = "samsung";
        // Mobile.name = "SmartPhone";
        // obj1.price = 1500;

        // Mobile obj2 = new Mobile();

        //To load the class, without creating an object
        Class.forName("Mobile");


    }
}