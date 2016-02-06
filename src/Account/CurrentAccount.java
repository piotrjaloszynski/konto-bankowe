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

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "limitAccount='" + limitAccount + '\'' +
                ", saldo=" + saldo +
                ", currency=" + currency +
                ", debit=" + debit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        //if (!(o instanceof CurrentAccount)) return false;


        }
        CurrentAccount currentAccount= (CurrentAccount) o;// mamy  object rzutujemy na komputer i mamy dostep do jego skladowych


        //if (Double.compare(that.saldo, saldo) != 0) return false;
        //if (Double.compare(that.currency, currency) != 0) return false;
        //if (Double.compare(that.debit, debit) != 0) return false;
        //return limitAccount != null ? limitAccount.equals(that.limitAccount) : that.limitAccount == null;
     return name.equals(CurrentAccount.name);
    }

    @Override

    }
}



