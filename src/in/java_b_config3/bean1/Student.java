package in.java_b_config3.bean1;

import org.springframework.stereotype.Component;

@Component
public class Student
{
    public Student() {
        System.out.println("Student Bean Object Created...");
    }

    public void display()
    {
        System.out.println("I am Student Bean...");
    }
}
