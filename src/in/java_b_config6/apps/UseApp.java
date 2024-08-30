package in.java_b_config6.apps;

import in.java_b_config6.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseApp
{
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(in.java_b_config6.config.AppConfig.class);
        Student s1 = (Student)container.getBean("student");
        Student s2 = (Student) container.getBean("student");

        s1.display();
        s2.display();

        System.out.println();
        System.out.println("s1 hashcode : "+s1.hashCode());
        System.out.println("s2 hashcode : "+s2.hashCode());

    }
}
