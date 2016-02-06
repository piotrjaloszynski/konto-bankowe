package Account;

/**
 * Created by Gosia on 2016-01-27.
 */
class PrivateBankAccount extends Account   {
    private double credit;//ok
    private int accountsNumber; //MATKA

    public PrivateBankAccount(String ownerName, String ownerSurname, double credit, int accountsNumber) {
        super(ownerName, ownerSurname);
        this.credit = credit;
        this.accountsNumber = accountsNumber;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public int getAccountsNumber() {
        return accountsNumber;
    }

    public void setAccountsNumber(int accountsNumber) {
        this.accountsNumber = accountsNumber;
    }
    

}
