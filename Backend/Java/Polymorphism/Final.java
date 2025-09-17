
class Calc
{
    final public void show()
    {
        System.out.println("in Calc show");
    }

    public void add(int a, int b)
    {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc
{
    // public void show()
    // {
    //     System.out.println("in AdvCalc show");
    // }
}

final class B
{
    public void show()
        {
            System.out.println("in B show");
        }
    
}


public class Final
{
    public static void main(String[] args)
    {
        Calc obj = new Calc();
        obj.show();
        obj.add(5, 8);

        B obj1 = new B();
        obj1.show();


    }
}