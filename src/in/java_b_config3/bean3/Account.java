package in.java_b_config3.bean3;

import org.springframework.stereotype.Component;

@Component
public class Account
{
    public Account() {
        System.out.println("Account Bean Created Viru...");
    }
    public void display()
    {
        System.out.println("I am Account Bean Viru...");
    }
}
