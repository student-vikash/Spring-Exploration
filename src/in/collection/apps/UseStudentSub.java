package in.collection.apps;

import in.collection.beans.StudentSub;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudentSub
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/collection/resources/StudentSubConfig.xml");
        StudentSub st=container.getBean(StudentSub.class);

        System.out.println("Your Name is : "+st.getName());
        System.out.println("Your Enrollment is : "+st.getEnrollment());
        System.out.println("Your all Selected Subjects are : "+st.getSubjects());
    }
}
