package in.p_c_injection.apps;

import in.p_c_injection.beans.Laptop;
import in.p_c_injection.beans.Laptop2;
import in.p_c_injection.beans.Programmer;
import in.p_c_injection.beans.Programmer2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class UseProgrammer2
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/p_c_injection/resources/allconfig.xml");
        Programmer2 p=container.getBean(Programmer2.class);

        System.out.println("Programmer Name : "+p.getName());

        Laptop2 l=container.getBean(Laptop2.class);
        System.out.println("Laptop Brand : "+l.getBrand());
    }

}
