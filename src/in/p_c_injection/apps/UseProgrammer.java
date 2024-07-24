package in.p_c_injection.apps;

import in.p_c_injection.beans.Laptop;
import in.p_c_injection.beans.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseProgrammer
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/p_c_injection/resources/programmer.xml","in/p_c_injection/resources/laptop.xml");
        Programmer p=container.getBean(Programmer.class);

        System.out.println("Programmer Name : "+p.getName());

        Laptop l=container.getBean(Laptop.class);
        System.out.println("Laptop Brand : "+l.getBrand());
    }
}
