class Human
{
    private int age;
    private String name;

    

    public int getAge()
    {
        return age;
    }
    public void setAge(int age) //creating a method for public
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;      //this is keyword
    }
}

public class Encapsulation
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        obj.setAge(26);
        obj.setName("Rajesh Reddy");


        Human obj1 = new Human();
        obj1.setAge(32);
        obj1.setName("Preeti");

        System.out.println(obj.getName() + ": " + obj.getAge());
        System.out.println(obj1.getName() + ": " + obj1.getAge());
    }
}