package Models;

public class Address {
    private int HNo;
    private String StreetName;
    private String CityName;
    private String State;

    public Address() {
    }

    public Address(int HNo, String streetName, String cityName, String state) {
        this.HNo = HNo;
        StreetName = streetName;
        CityName = cityName;
        State = state;
    }



    public int getHNo() {
        return HNo;
    }

    public void setHNo(int HNo) {
        this.HNo = HNo;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "HNo=" + HNo +
                ", StreetName='" + StreetName + '\'' +
                ", CityName='" + CityName + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
