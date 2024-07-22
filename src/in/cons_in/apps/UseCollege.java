package in.cons_in.apps;

import in.cons_in.beans.College;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCollege
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/cons_in/resources/college.xml");
        College c=container.getBean(College.class);

        System.out.println("Name is : "+c.getName());
    }
}
