package in.java_b_config5.apps;

import in.java_b_config5.beans.Car;
import in.java_b_config5.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseApp
{
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(in.java_b_config5.config.AppConfig.class);
        Student st= (Student) container.getBean("MyStudent");
        Car c = (Car) container.getBean("MyCar");

        st.display();
        c.display();
    }
}
