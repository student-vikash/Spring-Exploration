package in.collection.apps;

import in.collection.beans.SetStudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

public class UseSetStudent
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/collection/resources/setstudent.xml");
        SetStudent st=container.getBean(SetStudent.class);

        System.out.println("Name is : "+st.getName());
        System.out.println("Enrollment is : "+st.getEnrollment());
        System.out.println("Emails : ");
        Set<String> emails=st.getEmails();


        for(String e:emails)
        {
            System.out.println(e);
        }

    }
}
