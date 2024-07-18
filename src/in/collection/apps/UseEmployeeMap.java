package in.collection.apps;

import in.collection.beans.EmployeeMap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class UseEmployeeMap
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/collection/resources/employeemap.xml");
        EmployeeMap emp=container.getBean(EmployeeMap.class);

        System.out.println();

        System.out.println("Name : "+emp.getName());
        System.out.println("Job  ; "+emp.getJob());
        System.out.println("Working City : "+emp.getCity());

        System.out.println("\n");

        System.out.println("=====  Developer Productivity =====\n");
        System.out.println("Working Day          Working Hour\n");

        Map<String ,Integer> per=emp.getProductivity();
        for(var p: per.entrySet())
        {
            System.out.println(p.getKey()+"          "+p.getValue());
        }

    }
}
