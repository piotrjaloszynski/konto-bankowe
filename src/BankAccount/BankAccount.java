package BankAccount;
import model.Address;
/**
 * Created by Piotr on 2016-01-09.
 */
public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private String ownerSurname;
    private  double saldo;
    private String currency;
    private double debit;
    private String interestGrowthSavingAccount;
    private String giftSavingAccount;
    private String relationshipManager;
    private String privateBankAccount;
    private String savingAccount;
    private String savingAccountForYoungPeople;
    private Address address;

    BankAccount() {//konstr bezparamentryczny
    }
    BankAccount( String savingAccountForYoungPeople,String savingAccount,String privateBankAccount, String interestGrowthSavingAccount,int accountNumber,String giftSavingAccount, String ownerName, String ownerSurname, double saldo, String currency, double debit,
                String relationshipManager){

        this.savingAccountForYoungPeople=savingAccountForYoungPeople;
        this.giftSavingAccount=giftSavingAccount;
        this.accountNumber=accountNumber;
    this.ownerName=ownerName;
    this.ownerSurname=ownerSurname;
    this.saldo=0;
    this.currency=currency;
    this.debit=debit;
    this.relationshipManager=relationshipManager;
    this.interestGrowthSavingAccount= interestGrowthSavingAccount;
    this.privateBankAccount=privateBankAccount;
    this.savingAccount=savingAccount;


    }

    public String toString() {// standardowa metoda ktora w javie funkcojonuje ktory ma pokazac obiekt na napis

        return savingAccountForYoungPeople+" " +savingAccount+""+ privateBankAccount+""+accountNumber+""+ interestGrowthSavingAccount+" " + ownerName+" " +giftSavingAccount + " " + ownerSurname + " " + saldo + " " + currency+ ""+debit+""+relationshipManager;
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
