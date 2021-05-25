import java.util.Date;

public class Address {

    private String country, city;
    private String address = "my address";

    static {
        System.out.println("creating class");
    }

     {
        System.out.println("creating object");
    }

    public  Address () {
        System.out.println("constructor");
    }


    public Address(String country,String address) {
        this(country, "yerevan", address);
        System.out.println("adas");
    }

    public Address(String country, String city, String address) {
        this.country = country;
        this.city = city;
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void printDate(Date date) {
        System.out.println(date);
    }

    public void printDate() {
        System.out.println("some custom logic");
    }
}
