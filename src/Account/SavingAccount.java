package Account;

/**
 * Created by Gosia on 2016-01-27.
 */
public class SavingAccount extends Account{
    private String telephoneNumber;//ok

    public SavingAccount(String ownerSurname, String ownerName,String telephoneNumber) {
        super(ownerName, ownerSurname);
        this.telephoneNumber = telephoneNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "telephoneNumber='" + telephoneNumber + '\'' +
                               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return true;

        }
        SavingAccount savingAccount =(SavingAccount)o;
        return ownerName.equals(savingAccount.ownerName);
    }
    @Override
    public int hashCode() {
        return ownerName.hashCode();

}}