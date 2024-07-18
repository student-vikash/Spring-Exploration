package in.viru.beans;

public class CompanyA
{
    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public String [] getWorkers() {
        return workers;
    }

    public void setWorkers(String[] workers) {
        this.workers = workers;
    }

    private String comp_name;
    private String [] workers;
}
