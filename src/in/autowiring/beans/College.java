package in.autowiring.beans;

public class College {
    private String college_Name;

    public void setCollege_Name(String college_Name) {
        this.college_Name = college_Name;
    }

    public void setDetails(Student details) {
        this.details = details;
    }

    private Student details;

    // method to show details
    public void showStudentData()
    {
        System.out.println("College Name is : "+college_Name);
        System.out.println("Student Name is : "+details.getName());
        System.out.println("Student Branch is : "+details.getBranch());
        System.out.println("Student Enrollment is : "+details.getEnrollment());
    }

}
