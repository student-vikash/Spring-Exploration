package in.construc.apps;

import in.construc.beans.Employee2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee2
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/construc/resources/employee2.xml");
        Employee2 emp=container.getBean(Employee2.class);


        System.out.println("Salary is : "+emp.getSalary());
        System.out.println("Name is : "+emp.getName());
    }
}
