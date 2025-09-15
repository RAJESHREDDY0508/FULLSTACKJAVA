
import java.util.Scanner;

//TEMPERATURE CONVERTER

/* Input: Celsius (double). Output: Fahrenheit (double, 1 decimal). Formula: F = C * 9/5 + 32.
Edge: try C = -40. */

public class Prob1
{
    public static void main(String[] args) 
    {
        /* final double TEMPERATURE = -40.7;
        double b = TEMPERATURE * 9.0/5.0 + 32;

        System.out.println("The temperature in Fahrenheit is : " + b); */

        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = c * 9.0/5.0 + 32;

        System.out.println("%.1f%n" + f);



    }
}