
import java.util.Scanner;

//Reading input until a condition

class Example2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String input = "";

        while(!input.equals("Exit"))
        {
            System.out.print("Type something (or 'exit' to quit): ");
            input = sc.nextLine();
        }
        
        System.out.println("Program ended.");
    }
}