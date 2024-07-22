package in.construc.apps;

import in.construc.beans.Employee3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee3
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/construc/resources/employee3.xml");
        Employee3 emp=(Employee3) container.getBean("empObj",Employee3.class);

        System.out.println("Name is : "+emp.getName());
        System.out.println("Enrollment is : "+emp.getEnrollment());
    }
}
