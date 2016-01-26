package bank;
/// CO Z TYM ZROBIC import model.Address;

/**
 * Created by Piotr on 2016-01-09.
 */
public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private String ownerSurname;
    private  double saldo;
    private String currency;
    private Boolean debit;
    private Boolean interestGrowthSavingAccount;
    private Boolean giftSavingAccount;

    private Boolean privateBankAccount;
    private Boolean savingAccount;
    private Boolean savingAccountForYoungPeople;

    private Address address; // odnosimy sie do klasy , nazwa skladowych mala litera.
    BankAccount() {//konstr bezparamentryczny
    }
    private BankAccount[] bankAccounts; // tablica zrobic tablice
    private int bankAccountsNumber; // ile realnie  za rzedem 25 zeby wpisac


    bankAccountsNumber = new BankAccount[10]; // tworzymy w tablicy puste miejsce  struktrure 10 komorek od 0 do 9
    bankAccountsNumber = 0;
// void ze nic sie nie pojawi
    public void addBankAccount(int accountNumber, String ownerName, String ownerSurname){// zeby ona dzialala to potrzebuje zeby
        // ktos dodal ..
        BankAccount newBankAccount = new BankAccount(accountNumber,ownerName, ownerSurname); // sugeruje nazwa  co bedzieznaczyc
        // teraz wpisac do ktorej z tych komorek np. do zerowej
        //bankAccounts[0] miejsce w tablicy do ktorego chcemy wpisac
        bankAccounts[bankAccountsNumber]=newBankAccount; // [przypisujemy do new bank account do zerowej komorki
        bankAccountsNumber++;// za kazdym razem bedzie dodawac w kontach komorek, zeby dodac jedno niz wiecej kont

        BankAccount( Boolean savingAccountForYoungPeople,Boolean savingAccount,Boolean privateBankAccount, Boolean interestGrowthSavingAccount,int accountNumber,Boolean giftSavingAccount, String ownerName, String ownerSurname, double saldo, String currency, Boolean debit,
        ){

            this.savingAccountForYoungPeople=savingAccountForYoungPeople;
            this.giftSavingAccount=giftSavingAccount;
            this.accountNumber=accountNumber;
            this.ownerName=ownerName;
            this.ownerSurname=ownerSurname;
            this.saldo=0;
            this.currency=currency;
            this.debit=debit;

            this.interestGrowthSavingAccount= interestGrowthSavingAccount;
            this.privateBankAccount=privateBankAccount;
            this.savingAccount=savingAccount;


        }
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

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public String getInterestGrowthSavingAccount() {
        return interestGrowthSavingAccount;
    }

    public void setInterestGrowthSavingAccount(String interestGrowthSavingAccount) {
        this.interestGrowthSavingAccount = interestGrowthSavingAccount;
    }



    public String getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(String savingAccount) {
        this.savingAccount = savingAccount;
    }

    public String getPrivateBankAccount() {
        return privateBankAccount;
    }

    public void setPrivateBankAccount(String privateBankAccount) {
        this.privateBankAccount = privateBankAccount;
    }

    public String getGiftSavingAccount() {
        return giftSavingAccount;
    }

    public void setGiftSavingAccount(String giftSavingAccount) {
        this.giftSavingAccount = giftSavingAccount;
    }

    public String getSavingAccountForYoungPeople() {
        return savingAccountForYoungPeople;
    }

    public void setSavingAccountForYoungPeople(String savingAccountForYoungPeople) {
        this.savingAccountForYoungPeople = savingAccountForYoungPeople;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getBankAccountsNumber() {
        return bankAccountsNumber;
    }

    public void setBankAccountsNumber(int bankAccountsNumber) {
        this.bankAccountsNumber = bankAccountsNumber;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }



    public void displayBankAccountList(){
        // petla zalatwi wswietlanie rachunkow
        for (int i=0; i<bankAccountsNumber; i++){
            System.out.println(bankAccounts[i]); // zeby wyciagnac konkretna kororke , i spelnia role licznika petli a druga
            // rola odwoluje soe do konkretnej komorki tablicy , i sie zwieksza o 1
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
// warunki
// moze otworzyc konto jesli spelnia warunki z rule engine
// i nie pochodzi z restricted countries
