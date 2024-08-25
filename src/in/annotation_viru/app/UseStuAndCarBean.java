package in.annotation_viru.app;

import in.annotation_viru.beans.Car;
import in.annotation_viru.beans.Student2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseStuAndCarBean
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
        container.register(in.annotation_viru.beans.Student2.class);
        container.register(in.annotation_viru.beans.Car.class);

        container.refresh();

        Student2 st = (Student2) container.getBean("student2");
        st.showStudent();
        Car c = (Car) container.getBean("car");
        c.carShow();

    }
}
