
import java.util.Arrays;
import java.util.List;

public class ForEachDemo
{
    public static void main(String[] args) 
    {
        List<Integer> nums = Arrays.asList(3, 7, 8, 9, 2, 4, 1, 6);
        

        nums.forEach(n -> System.out.println(n));
    }
}