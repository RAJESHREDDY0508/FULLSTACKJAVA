@FunctionalInterface
interface A          //SAM Interface
{
    void show();       //Only 1 method allowed

}


public class functionalInterface
{
    public static void main(String[] args) 
    {
        A obj = new A() 
        {
            public void show()
            {
                System.out.println("In show");
            }
        
        };
    }
}