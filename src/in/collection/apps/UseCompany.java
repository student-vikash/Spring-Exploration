package in.collection.apps;

import in.collection.beans.Company;
import in.collection.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UseCompany
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/collection/resources/company.xml");
        Company c=container.getBean(Company.class);

        System.out.println("Company Name : "+c.getCompName());
        System.out.println("\n");
        System.out.println("====   Employee List  ====\n ID        Name   \n");
        List<Employee> emp=c.getWorkers();
        for( Employee e:emp)
        {
            System.out.println(e.getId()+ "    "+e.getName());
        }

    }
}
