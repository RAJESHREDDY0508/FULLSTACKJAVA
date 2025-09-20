class RajeshException extends Exception
{
    public RajeshException(String string)
    {
        super(string);
    }
}

class A
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Demo");
    }
}



public class Duck
{
    static 
    {
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) 
    {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException ex) {
        }
    }
}
        