package in.collection.apps;

import in.collection.beans.Student3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.LinkedList;

public class UseStudent3
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/collection/resources/student3.xml");
        Student3 st=container.getBean(Student3.class);

        System.out.println("\n\n");

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
        LinkedList<Integer>marks=st.getMarks();
        for(Integer m: marks)
        {
            System.out.print(m+" ");
        }
    }
}
