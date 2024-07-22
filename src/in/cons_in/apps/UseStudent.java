package in.cons_in.apps;

import in.cons_in.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/cons_in/resources/student.xml");
        Student st=container.getBean(Student.class);

        System.out.println("College name is : "+st.getCollege());
        System.out.println("Student name is : "+st.getName());
        System.out.println("Student id is : "+st.getId());
    }
}
