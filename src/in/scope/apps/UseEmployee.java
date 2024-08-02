package in.scope.apps;

import in.construct2.beans.Emp;
import in.scope.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("in/scope/resources/employee.xml");

        Employee e1 = (Employee) container.getBean("empObj");
        Employee e2 = (Employee) container.getBean("empObj");

        System.out.println("\n  === First Employee values === \n");
        System.out.println("Name : "+e1.getName());
        System.out.println("Emp Id : "+e1.getId());

        System.out.println("\n === Second Employee Values ====\n");
        System.out.println("Name : "+e2.getName());
        System.out.println("Emp id : "+e2.getId());

        System.out.println("Employee reference is same or not : "+(e1==e2));
        System.out.println("e1's hashcode is : "+e1.hashCode());
        System.out.println("e2's hashcode is : "+e2.hashCode());
    }
}
