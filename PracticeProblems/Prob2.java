/* import java.util.Locale;
import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US); // use '.' for decimals

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (m): ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("BMI: %.1f%n", bmi);

        String category = (bmi < 18.5) ? "Underweight"
                         : (bmi < 25)  ? "Normal weight"
                         : (bmi < 30)  ? "Overweight"
                                       : "Obesity";
        System.out.println(category);
    }
}
 */

import java.util.Locale;
import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double weight = readPositiveDouble(sc, "Enter weight (kg): ");
        double height = readPositiveDouble(sc, "Enter height (m): ");

        double bmi = weight / (height * height);
        System.out.printf("BMI: %.1f%n", bmi);

        String category = (bmi < 18.5) ? "Underweight"
                         : (bmi < 25)  ? "Normal weight"
                         : (bmi < 30)  ? "Overweight"
                                       : "Obesity";
        System.out.println(category);
    }

    private static double readPositiveDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                double v = sc.nextDouble();
                if (v > 0) return v;
                System.out.println("Please enter a number > 0.");
            } else {
                System.out.println("Please enter a valid number (e.g., 70.5).");
                sc.next(); // discard invalid token
            }
        }
    }
}
