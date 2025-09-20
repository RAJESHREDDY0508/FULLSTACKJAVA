class RajeshException extends Exception
{
    public RajeshException(String string)
    {
        super(string);
    }
}

public class Customeexception
{
    public static void main(String[] args) 
    {
        int i = 20;
        int j = 0;

        try
        {
            j =18/i;
            if(j==0)
                throw new RajeshException("I don't want to print Zero");
        }
        catch(RajeshException e)
        {
            j = 18/1;
            System.out.println("That's the defualt output-" + e);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong: " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}

