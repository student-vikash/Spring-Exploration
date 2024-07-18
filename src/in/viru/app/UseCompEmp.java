package in.viru.app;

import in.viru.beans.CompanyA;
import in.viru.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCompEmp
{
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("in/viru/resources/compempconfig.xml");
        CompanyA c=(CompanyA) container.getBean(CompanyA.class);

        System.out.println("Company Name is : "+c.getComp_name());
        System.out.println("\n All employees are \n");

    }
}
