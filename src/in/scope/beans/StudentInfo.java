package in.scope.beans;

public class StudentInfo {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Address getAd() {
        return ad;
    }

    public void setAd(Address ad) {
        this.ad = ad;
    }

    public StudentInfo() {
    }

    private String name;
    private int rollNo;
    private Address ad;
}
