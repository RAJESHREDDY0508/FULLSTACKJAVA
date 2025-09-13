class Basics
{
    public static void main(String[] args)
    {
        //Define Car class here
        class Car{
            String brand;
            int year;

            void drive(){
                System.out.println("This car is driving....");
            }
        }
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Toyota";
        car1.year = 2015;

        car2.brand = "Jeep";
        car2.year = 2020;


        car1.drive();
        car2.drive();

        System.out.println(car1.brand + "-" + car1.year);
        System.out.println(car2.brand + "-" + car2.year);

    }
}