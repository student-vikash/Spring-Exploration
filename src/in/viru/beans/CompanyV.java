package in.viru.beans;

public class CompanyV
{
    private String comName;

    private EmployeeV[] workers;

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public EmployeeV[] getWorkers() {
        return workers;
    }

    public void setWorkers(EmployeeV[] workers) {
        this.workers = workers;
    }
}
