package in.java_b_config.beans;

import org.springframework.stereotype.Component;

@Component
public class Car
{

    public Car() {
        System.out.println("Car Object Bean Created...");
    }

    public void display()
    {
        System.out.println("I am Car Bean Viru...");
    }
}
