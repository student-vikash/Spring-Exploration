package in.annotation3.demobeans;

import org.springframework.stereotype.Component;

@Component("MyStudent")
public class Student {
    public Student() {
        System.out.println("Student Bean is Created...");
    }
    public void showStudent()
    {
        System.out.println("I am Student Class Viru...");
    }
}
