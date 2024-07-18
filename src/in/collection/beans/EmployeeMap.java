package in.collection.beans;

import java.util.Map;

public class EmployeeMap
{
    private String name;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Map<String, Integer> getProductivity() {
        return productivity;
    }

    public void setProductivity(Map<String, Integer> productivity) {
        this.productivity = productivity;
    }

    private String city;
    Map<String ,Integer> productivity;
    public EmployeeMap()
    {
        System.out.println("Viru Employee bean is Created...");
    }
}
