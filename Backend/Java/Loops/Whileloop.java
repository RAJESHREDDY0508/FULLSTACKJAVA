class Whileloop
{
    public static void main(String[] args)
    {
        int i = 1;
        while(i<=12)
        {
            System.out.println("Hello " + i);
            i++;        // update is important, or loop will never end
        }

        System.out.println("Bye " + i);
    }
}