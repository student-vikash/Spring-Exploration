package in.java_b_config6.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("MyStudent")
//@Scope(value = "singleton")
@Scope(value = "prototype")
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class Student2
{
    public Student2()
    {
        System.out.println("Student Bean Created...");
    }
    public void display()
    {
        System.out.println("I am Student Bean Viru...");
    }
}
