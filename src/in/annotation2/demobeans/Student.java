package in.annotation2.demobeans;


import org.springframework.stereotype.Component;

@Component
public class Student
{
    public Student()
    {
        System.out.println("Student Constructor is Called ...");
    }
    public void display()
    {
        System.out.println("I am Student Bean Viru...");
    }
}
