class Human
{
    private int age;
    private String name;

    //Constructor - basically it look like a method(we don't specify the return type)
    public Human()
    {
        age = 12;
        name = "John";
    }

    public Human(int age, String name) //parameterized constructor
    {
        this.age = age;
        this.name = name;
    }

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

public class Demo
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        obj.setAge(26);
        obj.setName("Rajesh Reddy");


        Human obj1 = new Human(18, "Preeti");

        System.out.println(obj.getName() + ": " + obj.getAge());
        System.out.println(obj1.getName() + ": " + obj1.getAge());
    }
}