package model;

/**
 * Created by Gosia on 2016-01-22.
 */
public class Customer {
    private String name;
    private String surname;
    private String pesel;
    private String email;

    public Customer() {
        // po to zeby stworzyc obiekt klienta bez podawania danych, bez tego musialbm podac wszystkie 4
    }

    public Customer(String surname, String name, String pesel, String email) {
        this.surname = surname;
        this.name = name;
        this.pesel = pesel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    // metoda  z klasy bazowej, nadpisujemy klase z gory Customer
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override // adnotacja w java , odatkowe dane dla komplilatora oprocz kodu , metadane
    public boolean equals(Object obj) {
        // wynika z dokumentacji
        // zediniowane kryteriow uzytkownikow ktorych bedziemy opisywac
        //rzutowanie polega ze w cheirarjii dziedziczenia mozna zamieniac jeden object na drugi
        Customer u2 = (Customer) obj;// bez new bo porownujemy 2 obiekty bo juz sa stad nie tworzmy z new
        if (this.pesel.equals(u2.pesel)) {
            if(this.email.equals(u2.email)){
                return true; // bo u2 ma rowniez email,
            }else{
                return false;//  tylko do else jednego i koniec  nie idzie do 2 else  .
            }




        } else {
            return false;

        }
    }
}
