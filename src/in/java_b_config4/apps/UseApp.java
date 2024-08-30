package in.java_b_config4.apps;

import in.java_b_config4.beans.Student;
import in.java_b_config4.beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseApp
{
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(in.java_b_config4.config.AppConfig.class);
        Student st= (Student) container.getBean("student");
        Car c = (Car) container.getBean("car");

        st.display();
        c.display();
    }
}
