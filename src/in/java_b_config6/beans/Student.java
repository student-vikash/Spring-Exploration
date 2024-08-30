package in.java_b_config6.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public class Student
{

    public Student() {
        System.out.println("Student Bean Created...");
    }
    public void display()
    {
        System.out.println("I am Student Bean Viru...");
    }
}
