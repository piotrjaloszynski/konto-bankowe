package Account;

import bank.Address;

/**
 * Created by Gosia on 2016-01-27.
 */
public class CurrentAccount extends Account{
 private String limitAccount;
    private  double saldo;//ok
    private double currency;//ok
    private double debit;//ok

    public CurrentAccount(String ownerName,String ownerSurname ,String limitAccount, double saldo, double currency, double debit) {
        super(ownerName, ownerSurname);
        this.limitAccount = limitAccount;
        this.saldo = saldo;
        this.currency = currency;
        this.debit = debit;

    }

    public String getLimitAccount() {
        return limitAccount;
    }

    public void setLimitAccount(String limitAccount) {
        this.limitAccount = limitAccount;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "limitAccount='" + limitAccount + '\'' +
                ", saldo=" + saldo +
                ", currency=" + currency +
                ", debit=" + debit +
                "ownerSurname=" + ownerSurname +
                "ownerName=" + ownerName +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return true;
        //if (!(o instanceof CurrentAccount)) return false;


        }
        CurrentAccount currentAccount= (CurrentAccount) o;// mamy  object rzutujemy na komputer i mamy dostep do jego skladowych

     return ownerName.equals(currentAccount.ownerName);
    }

    @Override
    public int hashCode() {
        return ownerName.hashCode();
    }
    }




