package in.scope.apps;

import in.scope.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/scope/resources/student.xml");
        Student st=(Student) container.getBean("stObj");
        Student st2=(Student)container.getBean("stObj");


        System.out.println("\n  Student One Details   \n");
        System.out.println("Name : "+st.getName());
        System.out.println("Id : "+st.getId());

        System.out.println("\n  Student Two Details  \n");
        System.out.println("Name : "+st2.getName());
        System.out.println("Id : "+st2.getId());

        System.out.println("\n ====== Both references are pointing to the same object ====== ");

        System.out.println(st==st2);

        System.out.println("\n === HashCode ===\n");
        System.out.println("st hashcode is : "+st.hashCode());
        System.out.println("st2 hashcode is : "+st.hashCode());

    }
}
