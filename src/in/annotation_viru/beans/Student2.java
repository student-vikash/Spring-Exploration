package in.annotation_viru.beans;

import org.springframework.stereotype.Component;

@Component
public class Student2
{
    public Student2()
    {
        System.out.println("Student Constructor is Called ...");
    }
    public void showStudent()
    {
        System.out.println("I am Student Bean Viru...");
    }
}
