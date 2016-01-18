package BankAccount;

/**
 * Created by Piotr on 2016-01-09.
 */
public class BankAccount {
    int accountNumber;
    String ownerName;
    String ownerSurname;
    public double saldo;
    String currency;
    double debit;
    String relationshipManager;
    BankAccount() {//konstr bezparamentryczny
    }
    BankAccount(int accountNumber, String ownerName, String ownerSurname, double saldo, String currency, double debit,
                String relationshipManager){

    this.accountNumber=accountNumber;
    this.ownerName=ownerName;
    this.ownerSurname=ownerSurname;
    this.saldo=saldo;
    this.currency=currency;
    this.debit=debit;
    this.relationshipManager=relationshipManager;
    }

    public String toString() {// standardowa metoda ktora w javie funkcojonuje ktory ma pokazac obiekt na napis

        return accountNumber + " " + ownerName + " " + ownerSurname + " " + saldo + " " + currency+ ""+debit+""+relationshipManager;
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

    public void toTransfer(double amount, String currency) {
        if (saldo>amount){
            saldo = saldo + amount;
            System.out.println("Enjoy your transfer");
        }  else {
             System.out.println("You can not transfer the money due to lacking funds:" + "currency" );



        }
        }
    }
