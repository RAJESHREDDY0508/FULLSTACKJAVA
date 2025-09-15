public class String
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("rajesh");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Reddy");
        System.out.println(sb);
        sb.deleteCharAt(2);
        sb.insert(0, "Mr.");
        System.out.println(sb);
        sb.setLength(30);
        sb.ensureCapacity(100);



    }
}