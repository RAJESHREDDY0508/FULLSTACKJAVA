
import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface
{
    public static void main(String[] args)
    {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(9);
        nums.add(2);
        nums.add(4);

        for(int n : nums)
        {
        System.out.println(n);
        }
    }
}