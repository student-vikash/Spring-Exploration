package in.p_c_injection.apps;

import in.p_c_injection.beans.College;
import in.p_c_injection.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCollege
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/p_c_injection/resources/collegestudent.xml");

        College c= container.getBean(College.class);
        Student st=c.getName();


        System.out.println("College Name is : "+c.getCollegeName());
        System.out.println("Student Name is : "+st.getRollno());
    }
}
