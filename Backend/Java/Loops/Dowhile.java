class Dowhile
{
    public static void main(String[] args) {
        {
            int i =10;
            do              //It always runs the loop of the body atleast once since the condition is checked after the loop executes.
            {
                System.out.println("Number : " + i);
                i++;
            }while(i<=5);
            System.out.println("BYE");
        }
    }
}
