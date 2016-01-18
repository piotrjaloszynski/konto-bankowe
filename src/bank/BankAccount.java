package bank;

/**
 * Created by Piotr on 2016-01-09.
 */
public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private String ownerSurname;
    private double saldo;


    public BankAccount(int accountNumber, String ownerName, String ownerSurname) {
        //paramentry oddzielone przecinkami to sa dane ktore skladaja sie z nazwy i typu//
        //dane na wejsci to co wiemy na poczatku z czego funkcja mzoe skorzstac
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.saldo = 0;
    }


    public BankAccount() {//konstr bezparamentryczny , jak metody publiczne to kontstruktor publiczny


    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getOwnerSurname() {
        return ownerSurname;

    }

    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }

    public String toString()// standardowa metoda ktora w javie funkcojonuje ktory ma pokazac obiekt na napis
    {
        return accountNumber + " " + ownerName + " " + ownerSurname + " " + saldo;
    }


    public void toPayIn(double amount) {
        //kwota wplaty  widocznosc dla metody
        //co metoda zwraca,  nazwa funkcji, ;lista parametrow
        saldo = saldo + amount; // jak masz wczesniej zdeklarowana to nie trzeba ponownie deklarowac stad tylko amount

        //if(accountNumber<0 || accountNumber<=3){
        //   throw new IllegalArgumentException("Wrong number");
        //}

//else  accountNumber>0 || accountNumber>=4) {
        //      throw new "correct number checking availibity";

    }


    public void toPayOut(double amount) {


        if (saldo >= amount) {
            saldo = saldo - amount;
        } else { // klamra zamykajaca na poziomie if gdzie sie otwiera
            System.out.println("You do not have enough money");//sout skrot z klawiatury
        }
    }
}