

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("age=").append(age);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age)
                    return 1;
                else
                    return -1;
    }


}

public class ComparatorUsingLambda
{
    public static void main(String[] args) 
    {
        Comparator<Student> com = (i, j) -> i.age>j.age?1:-1;  //Lambda expression with ternary operator
        
        List<Student> studs = new ArrayList<>();

        studs.add(new Student(26, "Rajesh"));
        studs.add(new Student(20, "Preeti"));
        studs.add(new Student(15, "Ram"));
        studs.add(new Student(39, "Sita"));3

        Collections.sort(studs);
        
        for(Student s : studs)
            System.out.println(s);
    }
}