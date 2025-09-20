
import java.util.Scanner;



public class Demo
{
    public static void main(String[] args) 
    {
/*         try {
            // try {
            //     System.out.println("Enter the number");
            //     int x = System.in.read();
            //     System.out.println(x);   //It will show along with the asky value
            // } catch (IOException ex) {
            // }
            
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(in);
            
            int x = Integer.parseInt(bf.readLine());
            System.out.println("Enter the value:" + x);
            bf.close();
        } catch (IOException ex) {
        }
 */
        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Your number: " + x);


    }
}