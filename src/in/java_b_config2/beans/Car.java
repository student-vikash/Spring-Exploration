package in.java_b_config2.beans;

import org.springframework.stereotype.Component;

@Component
public class Car

{
    public Car() {
        System.out.println("Car Object is Created...");
    }
    public void display()
    {
        System.out.println("I am Car Bean Viru...");
    }
}
