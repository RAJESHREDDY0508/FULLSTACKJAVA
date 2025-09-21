

sealed class A extends Thread implements Cloneable permits B,C {
//we can extend any other class
//we can also implemt any other interface
//But, permit shoulb be after the extending and implements
}

non-sealed class B extends A {

}

final class C extends A {

}

class D extends B {

    public void show()
    {
        System.out.println("Hi");
    }

}

sealed interface X permits Y
{

}
non-sealed interface  Y extends X
{
    //interface can never be a final. It should be sealed or non-sealed
}


public class SealedClass
{
    public static void main(String[] args) 
    {
        D obj = new D();
        obj.show();
    }
}