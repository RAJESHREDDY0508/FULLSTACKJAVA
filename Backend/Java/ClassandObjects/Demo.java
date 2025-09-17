class Calculator
{

    public int add(int n1, int n2) //n1 and n2 are declared inside a add method
    {
        int a = n1 + n2;
        return a;

    }
}


public class Demo
{
    public static void main(String[] args)
        {
            int num1 = 4;
            int num2 = 5;

            Calculator calc = new Calculator();        //calc is a referance variable

            int result = calc.add(num1, num2);       //new Calculator creates a new object

            System.out.println(result);


        }
}
