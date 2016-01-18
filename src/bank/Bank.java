package bank;

import model.Address;

/**
 * Created by Piotr on 2016-01-08.
 */
public class Bank {
    private String name;
    private Address address; // odnosimy sie do klasy , nazwa skladowych mala litera.
    private BankAccount[] bankAccounts; // tablica zrobic tablice
    private int bankAccountsNumber; // ile realnie  za rzedem 25 zeby wpisac
    public Bank() {
        bankAccounts = new BankAccount[10]; // tworzymy w tablicy puste miejsce  struktrure 10 komorek od 0 do 9
        bankAccountsNumber = 0;

    }// void ze nic sie nie pojawi
    public void addBankAccount(int accountNumber, String ownerName, String ownerSurname){// zeby ona dzialala to potrzebuje zeby
        // ktos dodal ..
       BankAccount newBankAccount = new BankAccount(accountNumber,ownerName, ownerSurname); // sugeruje nazwa  co bedzieznaczyc
        // teraz wpisac do ktorej z tych komorek np. do zerowej
        //bankAccounts[0] miejsce w tablicy do ktorego chcemy wpisac
        bankAccounts[bankAccountsNumber]=newBankAccount; // [przypisujemy do new bank account do zerowej komorki
        bankAccountsNumber++;// za kazdym razem bedzie dodawac w kontach komorek, zeby dodac jedno niz wiecej kont

    }
    public void displayBankAccountList(){
        // petla zalatwi wswietlanie rachunkow
        for (int i=0; i<bankAccountsNumber; i++){
            System.out.println(bankAccounts[i]); // zeby wyciagnac konkretna kororke , i spelnia role licznika petli a druga
            // rola odwoluje soe do konkretnej komorki tablicy , i sie zwieksza o 1
        }
    }
}
