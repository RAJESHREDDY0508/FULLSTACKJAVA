abstract class Computer
{
    public abstract void code();


}



class Laptop extends Computer
{
    public void code()
    {
        System.out.println("Coding, Compiling and Running.......");
    }
}

class Desktop extends Computer
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




public class Demo1
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