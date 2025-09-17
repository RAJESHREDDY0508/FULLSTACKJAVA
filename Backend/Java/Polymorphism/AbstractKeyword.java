abstract class Car
{
    public abstract void drive();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Music is Playing...");
    }
}

abstract class WagonR extends Car  //Abstract class
{
    public void drive()
    {
        System.out.println("Car is driving...");
    }
}

class AdvWagonR extends WagonR  //Concrete class
{
    public void fly()
    {
        System.out.println("Car is Flying...");
    }
}

public class AbstractKeyword
{
    public static void main(String[] args) 
    {
        Car obj = new AdvWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}