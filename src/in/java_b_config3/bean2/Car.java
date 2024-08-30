package in.java_b_config3.bean2;

import org.springframework.stereotype.Component;

@Component
public class Car
{
    public Car() {
        System.out.println("Car Bean Created ...");
    }
    public void display()
    {
        System.out.println("I am Car Bean Viru");
    }
}
