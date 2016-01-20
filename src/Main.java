import BankAccount.BankAccount;
import bank.RestrictedCountries;

/**
 * Created by Piotr on 2016-01-08.
 */
public class Main {


    public static void main(String[] args) {
        double amount=1000.35;
        BankAccount b= new BankAccount(23323,"Kowal","Smith",150);

        System.out.println( b.saldo);
        System.out.println("Przed wplata:="+ b.saldo);
        System.out.println("Wplacam:="+ amount);
        b.toPayIn(amount);
        System.out.println("Po wplacie:="+b.saldo  );

        BankAccount c= new BankAccount(34212,"Endrew","Bristol", 200);
        System.out.println("Przed wyplata:="+c.saldo);
        c.toPayOut(amount);
        System.out.println("Wyplacam:="+ amount );
        System.out.println("Po wyplacie:="+ c.saldo);

        BankAccount d= new BankAccount("zl");
        System.out.println(d.zl);
    }


}
