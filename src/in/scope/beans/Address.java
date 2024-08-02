package in.scope.beans;

public class Address
{
    public Address() {
        System.out.println();
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private int houseNo;
    private String city;

}
