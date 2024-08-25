package in.annotation2.samplebeans;

import org.springframework.stereotype.Component;

@Component
public class Car
{
    public Car()
    {
        System.out.println("Car Constructor is Called Viru...");
    }
    public void carShow()
    {
        System.out.println("I am Car Bean Viru...");
    }

}
