public class Wrapper
{
    public static void main(String[] args)
    {
        int num = 7;
        Integer num1 = new Integer(num);  //boxing


        int num2 = 7;
        Integer num3 = num2;  //autoboxing


        int num4 = num1.intValue();  //unboxing


        int num5 = num2;   // auto -unboxing


        String str = "123";
        int num6 = Integer.parseInt(str);

        System.out.println(num6*2);
        System.out.println(num5);
    }
}