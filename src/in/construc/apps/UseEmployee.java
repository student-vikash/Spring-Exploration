package in.construc.apps;

import in.construc.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/construc/resources/employee.xml");
        Employee s=container.getBean(Employee.class);
        System.out.println("Name:"+s.getName());
    }
}
