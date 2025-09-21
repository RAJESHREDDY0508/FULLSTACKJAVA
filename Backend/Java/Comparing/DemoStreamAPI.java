
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class DemoStreamAPI
{
    public static void main(String[] args) 
    {
        List<Integer> nums = Arrays.asList(3, 7, 8, 9, 2, 4, 1, 6);

        // Predicate<Integer> p = n -> (n%2==0);

        // Function<Integer, Integer> fun = n -> n*2;


        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter((n -> n%2==0));
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);

        Stream<Integer> sortedValues = nums.stream()
                        .filter(n -> n%2==0)
                        .sorted();


        sortedValues.forEach(n -> System.out.println(n));
    }
}