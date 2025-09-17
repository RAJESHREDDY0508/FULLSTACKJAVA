/* Problem Statement

You are asked to model a Bank System where:

Each bank account has:

An account holder name (instance variable).

An account number (instance variable).

All accounts belong to the same bank (e.g., "Bank of America").

Use a static variable for the bank name.

When the program starts:

A static block should initialize the bank name to "Chase".

Provide a static method changeBank(String newBank) that allows changing the bank name for all accounts.

Provide a method display() that prints:

Account Holder: [name], Account No: [number], Bank: [bank name] */

class Account
{
    static String bankName;
    String name;
    int accNumber;


    static
    {
        bankName = "Bank of America";
        System.out.println("Static block executed -> Bank initialized to Bank of America");
    }

    public Account(String name, int accNumber) 
    {
        this.name= name;
        this.accNumber= accNumber;
    }

    static void changeBank(String newBank)
    {
        bankName = newBank;
        System.out.println("Bank changed to: " + bankName);
    }

    void display()
    {
        System.out.println("Account Holder: " + name +
                           ", Account No: " + accNumber +
                           ", Bank: " + bankName);
    }
    



}


class Prob4
{
    public static void main(String[] args)
    {
        Account.changeBank("Wells Fargo");

        Account s1 = new Account("Rajesh", 4584517);
        Account s2 = new Account("Preeti", 56897452);

        s1.display();
        s2.display();

    }

}