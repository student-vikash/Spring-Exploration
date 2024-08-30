package in.java_b_config2.beans;

import org.springframework.stereotype.Component;

@Component
public class Student
{

    public Student() {
        System.out.println("Student Object created...");
    }

    public void display()
    {
        System.out.println("I am Student Bean Viru...");
    }
}
