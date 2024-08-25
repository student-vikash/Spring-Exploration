package in.annotation_viru.beans;

import org.springframework.stereotype.Component;

@Component
public class Car
{
    public Car()
    {
        System.out.println("Car constructor is Called ...");
    }
    public void carShow()
    {
        System.out.println("I am Car Bean Viru...");
    }
}
