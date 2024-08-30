package in.java_b_config3.apps;

import in.java_b_config3.bean1.Student;
import in.java_b_config3.bean2.Car;
import in.java_b_config3.bean3.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseApp
{
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(in.java_b_config3.config.AppConfig.class);

        Student st = (Student) container.getBean("student");
        Car c = (Car) container.getBean("car");
        Account ac = (Account) container.getBean("account");

        st.display();
        c.display();
        ac.display();
    }
}
