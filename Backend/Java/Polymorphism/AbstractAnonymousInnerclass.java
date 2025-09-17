abstract class A
{
    public void show()
    {
        System.out.println("In show");
    }
}




public class AbstractAnonymousInnerclass
{
    public static void main(String[] args) 
    {
        A obj = new A()
        {                                  //Abstract+Anonymous Inner class
            public void show()
            {
                System.out.println("In new Show..........");
            }
        };
        obj.show();
    }
}