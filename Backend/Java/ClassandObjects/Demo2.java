
//Method OVER-LOADING  (Since different methods with same name but differnet paramewters)

class Calculator
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2)
    {
        return n1 + n2;
    }
}

public class Demo2
{
    public static void main(String[] args) 
    {
        Calculator obj = new Calculator();
        int r1 = obj.add(3, 4);
        int r2 = obj.add(4, 6, 1);
        System.out.println(r1);
        System.out.println(r2);

    }
}