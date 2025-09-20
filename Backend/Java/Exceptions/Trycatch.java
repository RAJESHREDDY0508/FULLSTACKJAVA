
public class Trycatch
{
    public static void main(String[] args) 
    {
        int i = 0;
        int j = 0;

        try
        {
            j = 18/i; //Better to put critical blocks inside a try block
        }
        catch(Exception e) //Exception is class here and e is object
        {
            System.out.println("Something went wrong...");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}