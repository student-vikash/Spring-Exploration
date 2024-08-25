package in.annotation3.app;

import in.annotation3.demobeans.Student;
import in.annotation3.samplebeans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudentCar
{
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("in/annotation3/resources/studentcar.xml");
        Student st = (Student) container.getBean("MyStudent");
        Car cr = (Car) container.getBean("MyCar");

        st.showStudent();
        cr.carShow();
    }
}
