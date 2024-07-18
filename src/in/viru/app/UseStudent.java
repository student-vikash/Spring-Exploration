package in.viru.app;

import in.viru.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("/in/viru/resources/studentconfig.xml");
        Student st=(Student) container.getBean("stObj",Student.class);

        System.out.println("Your Name is : "+st.getName());
        System.out.println("Your Enrollment is "+st.getEnrollment());
        String []sub=st.getSubjects();
        System.out.println("\nYour all Subjects are : \n");
        for(String s:sub)
        {
            System.out.println(s);
        }
    }
}
