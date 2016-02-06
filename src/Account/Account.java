package Account;


/**
 * Created by Gosia on 2016-01-27.
 */
public class Account {

    protected String ownerName;//ok  MATKA
    protected  String ownerSurname;//ok MATKA

    public Account(String ownerName, String ownerSurname) {
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }


}