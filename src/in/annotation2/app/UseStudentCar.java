package in.annotation2.app;

import in.annotation2.demobeans.Student;
import in.annotation2.samplebeans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudentCar
{
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("in/annotation2/resources/studentcar.xml");
        Student st = (Student) container.getBean("student");
        Car cr = (Car) container.getBean("car");

        st.display();
        cr.carShow();

    }
}
