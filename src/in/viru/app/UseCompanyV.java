package in.viru.app;

import in.viru.beans.CompanyV;
import in.viru.beans.EmployeeV;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCompanyV
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/viru/resources/companyv.xml");
        CompanyV c=container.getBean(CompanyV.class);

        System.out.println("Company Name is : "+c.getComName());
        System.out.println("=====   Employees  =====");
        System.out.println();

        EmployeeV[] emp=c.getWorkers();
        System.out.println(" ID          Name   \n");
        for(EmployeeV e:emp)
        {
            System.out.println(+e.getId()+"      "+e.getName());
        }
    }
}
