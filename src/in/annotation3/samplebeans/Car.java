package in.annotation3.samplebeans;

import org.springframework.stereotype.Component;

@Component("MyCar")
public class Car {
    public Car() {
        System.out.println("MyCar Bean is Created...");
    }
    public void carShow()
    {
        System.out.println("I am Car Bean Viru...");
    }
}
