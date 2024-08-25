package in.annotation_viru.beans;

import org.springframework.stereotype.Component;

@Component
public class Car3
{

    public Car3() {
        System.out.println("Car Constructor is Called...");
    }
    public void carInfo()
    {
        System.out.println("I am Car Bean Viru...");
    }
}
