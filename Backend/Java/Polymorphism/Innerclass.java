class A
{
    int age;

    public void show()
    {
        System.out.println("In show");
    }
    class B
    {

        public void config()
        {
            System.out.println("In Congif...");
        }

    }
}


public class Innerclass
{
    public static void main(String[] args) 
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();



        A.B obj1 = obj.new B(); //If you are referring to static class, there is no need of object to refer here
        obj1.config();
    }
}