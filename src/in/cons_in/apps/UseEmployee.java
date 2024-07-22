package in.cons_in.apps;

import in.cons_in.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/cons_in/resources/employee.xml");
        Employee emp=container.getBean(Employee.class);

        System.out.println("Company is : "+emp.getCompany());
        System.out.println("Id is : "+emp.getId());
    }
}
