interface  Computer
{
    void code();


}



class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Coding, Compiling and Running.......");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Coding, Compiling and Running.......Fasterrrrrrrrrrrrrrrrrrrrrrrrr");
    }
}

class Developer
{
    public void devApp(Computer lap) //passing the object lap form Laptop
    {
        lap.code();
    }
}




public class Demo1withInterface
{
    public static void main(String[] args) 
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer Raj = new Developer();
        Raj.devApp(lap);
        Raj.devApp(desk);
    }
}