package in.collection.beans;

import java.util.ArrayList;
import java.util.LinkedList;

public class Student3
{
    private String name;
    private String enrollment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name passed as : "+name.getClass());
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
        System.out.println("Subjects passed as : "+subjects.getClass());
    }

    public LinkedList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(LinkedList<Integer> marks) {
        this.marks = marks;
        System.out.println("Marks passed as : "+marks.getClass());
    }

    private ArrayList<String>subjects;
    private LinkedList<Integer> marks;
    public Student3()
    {
        System.out.println("Student bean Created...");
    }
}
