package in.p_c_injection.beans;

public class College
{
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Student getName() {
        return name;
    }

    public void setName(Student name) {
        this.name = name;
    }

    private String collegeName;
    private Student name;

    public College() {
    }
}
