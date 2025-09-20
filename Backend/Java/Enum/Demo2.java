enum Laptop
{
    Macbook(1900), Samsung(2200), Dell, Asus(1200);

    private int price;

    private Laptop()
    {
        price = 500;
    }


    private Laptop(int price)
    {
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        System.out.println("Print laptop" + this.name());
    }


}


public class Demo2
{
    public static void main(String[] args) 
    {
        // Laptop lap = Laptop.Samsung;

        Laptop.Dell.setPrice(1800);
        
        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap + ": " + lap.getPrice());
        }
    }
}