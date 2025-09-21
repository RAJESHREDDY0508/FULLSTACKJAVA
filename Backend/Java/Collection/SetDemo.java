
import java.util.*;



public class SetDemo
{
    public static void main(String[] args)
    {
        Set<Integer> nums = new TreeSet<Integer>();

        nums.add(62);
        nums.add(58);
        nums.add(74);
        nums.add(12);

        Iterator<Integer> values =  nums.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }
        
        for(int n : nums)
        {
            System.out.println(n);
        }

    }
}