public class Trymultiplecatch
{
    public static void main(String[] args) 
    {
        int i = 2;
        int j = 0;
        String str = null;

        int nums[] = new int[5];

        try
        {
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Stay in the limit defined");
        }
        catch(Exception e2)
        {
            System.out.println("Something went wrong: " + e2);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}