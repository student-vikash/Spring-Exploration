package in.construct2.apps;

import in.construct2.beans.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmp {
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/construct2/resources/emp.xml");
        Emp emp=container.getBean("empObj",Emp.class);

        emp.show();
    }
}
