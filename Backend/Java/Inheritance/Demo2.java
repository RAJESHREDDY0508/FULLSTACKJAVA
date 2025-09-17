

//SUPER method and THIS method in INHERITANCE


class A
{
    public A()
    {
        System.out.println("in A");
    }

    public A(int n)
    {
        System.out.println("in A int");
    }

}

class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }

    public B(int n)
    {
        this();
        System.out.println("in b int");
    }

}

public class Demo2
{
    public static void main(String[] args) 
    {
        B obj = new B(5);

    }
}