package in.java_b_config2.apps;

import in.java_b_config2.beans.Car;
import in.java_b_config2.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseApp
{
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(in.java_b_config2.beans.AppConfig.class);
        Student st= (Student) container.getBean("student");
        Car c = (Car) container.getBean("car");

        st.display();
        c.display();

    }
}
