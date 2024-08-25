package in.autowiring.apps;

import in.autowiring.beans.College;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseCollege2
{
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("in/autowiring/resources/college_default.xml");
        System.out.println("Container Started...");

        College d = container.getBean(College.class);
        d.showStudentData();
    }
}
