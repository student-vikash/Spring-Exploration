package in.java_b_config6.apps;

import in.java_b_config6.beans.Student2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseApp2 {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(in.java_b_config6.config.AppConfig2.class);
        Student2 s1 = (Student2) container.getBean("MyStudent");
        Student2 s2 = (Student2) container.getBean("MyStudent");

        s1.display();
        s2.display();

        System.out.println();

        System.out.println("s1 hashCode : "+s1.hashCode());
        System.out.println("s2 hashCode : "+s2.hashCode());


    }
}