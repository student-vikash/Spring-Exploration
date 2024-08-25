package in.annotation_viru.beans;

import org.springframework.stereotype.Component;

@Component
public class Student3
{

    public Student3() {
        System.out.println("Student Constructor is Called...");
    }
    public void studentInfo()
    {
        System.out.println("I am Student Viru...");
    }
}
