import bank.Bank;
import bank.BankAccount;

/**
 * Created by Piotr on 2016-01-08.
 */
public class Main {


    public static void main(String[] args) {
        double amount=1000.35;
        BankAccount b= new BankAccount(23323,"Kowal","Smith");

        System.out.println( b.getSaldo());
        System.out.println("Przed wplata:="+ b.getSaldo());
        System.out.println("Wplacam:="+ amount);
        b.toPayIn(amount);
        System.out.println("Po wplacie:="+b.getSaldo() );

        BankAccount c= new BankAccount(34212,"Endrew","Bristol");
        System.out.println("Przed wyplata:="+c.getSaldo());
        c.toPayOut(amount);
        System.out.println("Wyplacam:="+ amount );
        System.out.println("Po wyplacie:="+ c.getSaldo());
      Bank bank= new Bank(); // alt na zmienieej
        bank.addBankAccount(292929922,"Kowal","One");
        bank.addBankAccount(23131,"Jon","Nowak");
        bank.displayBankAccountList();// main napotykajac metode pojdzie do zrodla i skorzsta main z niej

    }

}
