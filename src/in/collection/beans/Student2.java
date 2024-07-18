package in.collection.beans;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student2
{
    private String name;
    private String enrollment;
    private ArrayList<String> subjects;
    private ArrayList<Integer> marks;
    public Student2()
    {
        System.out.println("Student bean created...");
    }

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

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }
}
