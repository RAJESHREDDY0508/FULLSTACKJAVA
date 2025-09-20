@FunctionalInterface
interface A
{
    int add(int i, int j);
}

public class Demo2
{
    public static void main(String[] args) 
    {
        A obj = (i, j) -> i + j; //lambda expression


        int result = obj.add(5, 9);
        System.out.println(result);
    }
}