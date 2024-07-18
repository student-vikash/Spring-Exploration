package in.collection.beans;

import java.util.Map;

public class MapStudent
{
    private String name;
    private String enrollment;
    Map<String ,Integer> performance;

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

    public Map<String, Integer> getPerformance() {
        return performance;
    }

    public void setPerformance(Map<String, Integer> performance) {
        this.performance = performance;
    }

    public MapStudent()
    {
        System.out.println("Bean created Viru...");
    }

}
