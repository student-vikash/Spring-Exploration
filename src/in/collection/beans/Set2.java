package in.collection.beans;

import java.util.Set;

public class Set2
{
    private String name;
    private String enrollment;
    private Set<String> emails;

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

    public Set2()
    {
        System.out.println("Viru Bean Created...");
    }
}
