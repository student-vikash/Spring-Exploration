package in.scope.apps;

import in.scope.beans.Employee;
import in.scope.beans.EmployeePrototype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployeePrototype
{
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("in/scope/resources/employeeeprototype.xml");
        System.out.println("Container Started...");

        EmployeePrototype e1 = (EmployeePrototype) container.getBean("empObj");
        EmployeePrototype e2 = (EmployeePrototype) container.getBean("empObj");

        System.out.println("\n  === First Employee values === \n");
        System.out.println("Name : "+e1.getName());
        System.out.println("Emp Id : "+e1.getId());

        System.out.println("\n === Second Employee Values ====\n");
        System.out.println("Name : "+e2.getName());
        System.out.println("Emp id : "+e2.getId());

        System.out.println("Employee reference is same or not : "+(e1==e2));
        System.out.println("e1's hashcode is : "+e1.hashCode());
        System.out.println("e2's hashcode is : "+e2.hashCode());

        if(e1.hashCode() != e2.hashCode())
        {
            System.out.println("\n Both have different hashcode , proves instantiation of TWO OBJ..");
        }
    }
}
