record Alien(int id, String name) 
{
    //Here, It automatically generating the constructor, getters, equals(), hashcode() and toString() methods
    //It is immutable, it is created just to carry data
}

public class Recordclasses
{
    public static void main(String[] args)
    {
        Alien a1 = new Alien(1, "Rajesh");
        Alien a2 = new Alien(2, "Preeti");
        Alien a3 = new Alien(1, "Rajesh");

        System.out.println(a2);
        System.out.println(a1.equals(a3));
    }
}