package in.cons_in.beans;

public class Employee
{
    private String company;
    private int id;

    public Employee(String company, int id) {
        System.out.println("String - int bean Created Viru...");
        this.company = company;
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getId() {
        return id;
    }


}
