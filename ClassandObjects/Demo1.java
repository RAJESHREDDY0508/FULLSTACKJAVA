class Computer
{
    public void playMusic()
    {
        System.out.println("music is playing....");
    }

    public String getMeAPen(int cost)
    {
        if(cost == 10)

            return "Pen";
        
        else
            return "Nothing";
    }
}

public class Demo1
{
    public static void main(String[] args)
    {
        Computer obj = new Computer();      //Creating an object

        obj.playMusic();
        String str = obj.getMeAPen(19);
        System.out.println(str);

    }
}