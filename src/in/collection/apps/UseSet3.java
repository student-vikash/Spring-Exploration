package in.collection.apps;

import in.collection.beans.Set3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

public class UseSet3
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/collection/resources/set3.xml");
        Set3 st=container.getBean(Set3.class);

        System.out.println("Name is : "+st.getName());
        System.out.println("Enrollment is : "+st.getEnrollment());
        System.out.println("Emails are : ");
        Set<String>emails=st.getEmails();
        for(String e:emails)
        {
            System.out.println(e);
        }
    }
}
