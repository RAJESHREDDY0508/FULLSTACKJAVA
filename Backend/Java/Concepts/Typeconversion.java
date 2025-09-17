class Typeconversion
{
    public static void main(String a[])
    {
        byte b = 127;
        int n = 257;  
        byte m = (byte)n;       //Since byte is of only 8 bits int n is casted to k by performing modular operation

        float f = 5.68f;
        int t = (int)f;

        byte k = 10;
        byte j = 30;
        int result = k*j;   //since k and j are bytes result is int to remove the out of range error by 'type promotion'

        System.out.println(b);
        System.out.println(m);
        System.out.println(t);
        System.out.println(result);
    }
}