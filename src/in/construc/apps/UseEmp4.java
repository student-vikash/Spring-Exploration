package in.construc.apps;

import in.construc.beans.Emp4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmp4
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/construc/resources/emp4.xml");
        Emp4 emp= container.getBean( Emp4.class);

        emp.show();
    }
}
