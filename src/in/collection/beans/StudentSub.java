package in.collection.beans;

import java.util.ArrayList;

public class StudentSub
{
    private String name;
    private String enrollment;
    private ArrayList<String>subjects;

    public StudentSub() {
        System.out.println("Student bean created...");
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
