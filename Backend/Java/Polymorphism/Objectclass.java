
import java.util.Objects;

class Laptop
{
    String model;
    int price;



    public boolean equals(Laptop that)
    {
            return this.model.equals(that.model) && this.price == that.price;
    } 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.model);
        hash = 13 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laptop other = (Laptop) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Laptop{");
        sb.append("model=").append(model);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

}  

public class Objectclass
{
    public static void main(String[] args) 
    {
        Laptop obj = new Laptop();
        obj.model = "Samsung S10 Ultra";
        obj.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Samsung S10 Ultra";
        obj2.price = 1000;

        boolean result = obj.equals(obj2);



        System.out.println(obj.toString());  //everytime you try to print the object it will run the toString() method
        System.out.println(result);
    }
}