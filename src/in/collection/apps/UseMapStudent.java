package in.collection.apps;

import in.collection.beans.MapStudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class UseMapStudent
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/collection/resources/mapstudent.xml");
        MapStudent st=container.getBean(MapStudent.class);

        System.out.println("Student Name : "+st.getName());
        System.out.println("Student Enrollment : "+st.getEnrollment());
        System.out.println("\n");
        System.out.println("====== Student Performance ======");
        Map<String,Integer>per=st.getPerformance();
        for(var p:per.entrySet())
        {
            System.out.println(p.getKey()+" --> "+p.getValue());
        }
    }
}
