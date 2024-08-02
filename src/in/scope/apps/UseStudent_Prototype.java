package in.scope.apps;

import in.scope.beans.Student_Prototype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent_Prototype {
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/scope/resources/st_property.xml");

        Student_Prototype st1 = (Student_Prototype)container.getBean("stObj1");
        Student_Prototype st2 = (Student_Prototype)container.getBean("stObj1");

        System.out.println("\n ==== This is the use of Prototype in bean scope ===\n");
        System.out.println("\nName : "+st1.getName()+"\nRoll NO : "+st1.getRollno()+"\n");

        System.out.println("\nName : "+st2.getName()+"\nRoll No : "+st2.getRollno()+"\n");

        System.out.println("\n ==== Checking HashCode ====\n");
        System.out.println("st1 hashcode is : "+st1.hashCode());
        System.out.println("st2 hashcode is : "+st2.hashCode());

    }
}
