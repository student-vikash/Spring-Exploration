package in.viru.app;

import in.viru.beans.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCompany
{
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("/in/viru/resources/companyconfig.xml");
        Company c=(Company) container.getBean("compObj1");
        System.out.println("Company Name is : "+c.getComp_name()+"\nAverage Salary is : "+c.getSalary());
        System.out.println("\n========  =========\n");
        String []emp=c.getSenior_emp();
        System.out.println("All Senior Employees are ");
        for(String e:emp)
        {
            System.out.println(e);
        }

    }
}
