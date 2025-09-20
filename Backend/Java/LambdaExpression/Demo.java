@FunctionalInterface
interface A
{
    void show(int i, int j);
}



public class Demo
{
    public static void main(String[] args) 
    {
        A obj = (i, j) -> System.out.println("In show " + i + ", j: " + j); //Lambda Expression
        obj.show(5, 9);
    }
}