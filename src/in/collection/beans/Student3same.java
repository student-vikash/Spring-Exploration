package in.collection.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.LinkedList;

public class Student3same
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public LinkedList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(LinkedList<Integer> marks) {
        this.marks = marks;
    }

    private String enrollment;
    private ArrayList<String>subjects;
    private LinkedList<Integer>marks;
    public Student3same()
    {
        System.out.println("Student bean created...");
    }

}
