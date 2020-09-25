//CS-151
//Professor Yulia Newton
//Assignment 3
//Name: Duc Huy Nguyen

public class Address {
    private int streetNum;
    private String streetName;
    private String city;
    private String zip;
    private String state;


    Address() {
        this.streetNum = -1;
        this.streetName = "default";
        this.city = "default";
        this.zip = "default";
        this.state = "default";
    }

    Address(int streetNum, String streetName, String city, String zip, String state) {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getZip() {
        return zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String toString() {
        return "Address{" +
                "streetNum=" + streetNum +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
