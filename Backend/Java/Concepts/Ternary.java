class Ternary
{
    public static void main(String[] args)
    {
        int x =5;
        int result = 1;

        result =(x>=10) ? 10 :          //Syntax -  variable = (condition) ? valueifTrue : valueiffalse
                (x>6) ? 15 :
                (x<1) ? 20 : 30;
        System.out.println(result);
    }
}