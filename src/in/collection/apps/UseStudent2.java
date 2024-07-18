package in.collection.apps;

import in.collection.beans.Student2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class UseStudent2
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/collection/resources/student2.xml");
        Student2 st=container.getBean(Student2.class);

        System.out.println("Name : "+st.getName());
        System.out.println("Enrollment : "+st.getEnrollment());

        System.out.print("Subjects : ");
        ArrayList<String>sub=st.getSubjects();
        for(String s:sub)
        {
            System.out.print(s+" ");
        }

        System.out.println();

        System.out.print("Marks : ");
        ArrayList<Integer>marks=st.getMarks();
        for(Integer m: marks)
        {
            System.out.print(m+" ");
        }
    }
}
