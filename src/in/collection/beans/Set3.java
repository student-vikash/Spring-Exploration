package in.collection.beans;

import java.util.Set;

public class Set3
{
    private String name;
    private String enrollment;

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

    public Set<String> getEmails() {
        return emails;
    }

    public void setEmails(Set<String> emails) {
        this.emails = emails;
    }

    private Set<String>emails;
    public Set3()
    {
        System.out.println("Bean Created Viru...");
    }
}
