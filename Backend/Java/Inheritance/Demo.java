public class Demo
{
    public static void main(String[] args) 
    {
        Calc obj = new Calc();
        AdvCalc obj1 = new AdvCalc();  //Inheritance
        ScientificCalc obj2 = new ScientificCalc();  //Multi-level Inheritance

        int r1 = obj.add(7, 8);
        int r2 = obj1.sub(7, 18);
        int r3 = obj1.multi(7, 18);
        int r4 = obj2.div(7, 1);
        double r5 = obj2.power(7, 2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}