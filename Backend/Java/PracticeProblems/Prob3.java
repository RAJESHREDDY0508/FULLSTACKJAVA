// Example: Static Variable + Static Method + Static Block

class Student {
    // 🔹 Static variable (shared by all objects)
    static String college;

    int id;      // instance variable
    String name; // instance variable

    // 🔹 Static block (runs once when class loads)
    static {
        college = "USD"; 
        System.out.println("Static block executed → College initialized to USD");
    }

    // Constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // 🔹 Static method (can access static variables directly)
    static void changeCollege(String newCollege) {
        college = newCollege;
        System.out.println("College changed to: " + college);
    }

    // Instance method
    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}

public class Prob3 {
    public static void main(String[] args) {
        // static block already executed when class is loaded

        // Call static method without creating object
        Student.changeCollege("GNI");

        // Create objects
        Student s1 = new Student(1, "Rajesh");
        Student s2 = new Student(2, "Preeti");

        // Display student details
        s1.display(); 
        s2.display(); 
    }
}