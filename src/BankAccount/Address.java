package BankAccount;

/**
 * Created by Gosia on 2016-01-17.
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
    public String toString() {// class object dziedziczona i nadpisywana
        return street + " " + number + " " + city + ""+ country;

}}

