package in.cons_in.apps;

import in.cons_in.beans.College;
import in.cons_in.beans.College2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCollege2
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/cons_in/resources/college2.xml");
        College2 c=container.getBean(College2.class);


        System.out.println("Name is : "+c.getName());
        System.out.println("Income is : "+c.getIncome());

    }
}
