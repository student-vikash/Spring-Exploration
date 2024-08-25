package in.annotation_viru.app;

import in.annotation_viru.beans.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseStudent
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
        container.register(in.annotation_viru.beans.Student.class);
        container.refresh();

        Student st = (Student) container.getBean("student");
        st.display();

    }
}
