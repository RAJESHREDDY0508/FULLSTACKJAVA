
import java.util.HashMap;
import java.util.Map;

public class MapsDemo
{
    public static void main(String[] args)
    {
        Map<String, Integer> students = new HashMap<>(); //Hashmap is not synchronized
        //Map<String, Integer> students = new Hashtable<>();  //Hashtable is synchronized

        students.put("Rajesh", 99);
        students.put("Preeti", 55);
        students.put("Srinu", 41);
        students.put("Ram", 87);
        students.put("Preeti", 69);

        
        //get all the keys
        System.out.println(students.keySet());

        for(String key : students.keySet())
        {
            System.out.println(key + ": " + students.get(key));
        }
        
        //System.out.println(students.get("Ram"));
        //System.out.println(students);

    }
}