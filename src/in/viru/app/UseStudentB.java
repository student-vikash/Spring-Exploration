package in.viru.app;

import in.viru.beans.StudentB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudentB
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("/in/viru/resources/studentBconfig.xml");
        StudentB s=(StudentB) container.getBean("stObj1");
        System.out.println("Name:"+s.getName());
        System.out.println("ID:"+s.getId());
        String[]subj=s.getSubjects();
        System.out.println("Subject names:");
        for(String s1:subj) {
            System.out.println(s1);
        }
    }
}
