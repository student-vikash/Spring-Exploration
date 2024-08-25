package in.annotation_viru.beans;

import org.springframework.stereotype.Component;

@Component
public class Student{
    public Student()
    {
        System.out.println("Student Bean Class Called...");
    }
    public void display()
    {
        System.out.println("Hello , Vikash How are you? You called me from Student Class.");
    }
}
