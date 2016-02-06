package bank;

/**
 * Created by Gosia on 2016-01-27.
 */
public class Address {
    String street;
    String city;
    int number;
    String country;



    Address(){


    }
    Address(String street, String city, int number, String country){
        this.street=street;
        this.city=city;
        this.number=number;
        this.country= country;

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {// class object dziedziczona i nadpisywana
        return street + " " + number + " " + city + ""+ country;

    }

}
