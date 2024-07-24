package in.p_c_injection.apps;

import in.p_c_injection.beans.Null_Injection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseNull {
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/p_c_injection/resources/nullinjection.xml");
        Null_Injection n=(Null_Injection) container.getBean("stOne");

        n.show();

        System.out.println("\n\n");

        Null_Injection n2=(Null_Injection) container.getBean("stTwo");
        n2.show();
    }
}
