//Employee Management System

class Employee
{
    String name;
    int salary;
    static String companyName;

    static
    {
        companyName = "Google";
        System.out.println("Static block executed -> Company initialized to Google");
    }

    public Employee(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }

    static void changeCompany(String newCompany)
    {
        companyName = newCompany;
        System.out.println("Company changed to: " + newCompany);
    }

    void display()
    {
    System.out.println("Employee: " + name + ", Salary: " + salary + ", Company: " + companyName);
    }
}


public class Prob5
{
    public static void main(String[] args) 
    {
        Employee.changeCompany("Meta");

        Employee e1 = new Employee("Rajesh", 80000);
        Employee e2 = new Employee("Preeti", 90000);

        e1.display();
        e2.display();

    }
}