package in.java_b_config6.apps;

import in.java_b_config6.beans.Student3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseApp3
{
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(in.java_b_config6.config.AppConfig3.class);
        Student3 s1 = (Student3) container.getBean("MyStudent");
        Student3 s2 = (Student3) container.getBean("MyStudent");

        s1.display();
        s2.display();

        System.out.println();

        System.out.println("s1 hashCode : "+s1.hashCode());
        System.out.println("s2 hashCode : "+s2.hashCode());

    }
}
