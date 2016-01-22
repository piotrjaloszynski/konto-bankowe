package bank;

/**
 * Created by Gosia on 2016-01-21.
 */
public class Trading {
private String trading;
private String chargingfortrading;
    Trading (String trading, String chargingfortrading){
    this.trading=trading;
    this.chargingfortrading=chargingfortrading;
    }
public String getTrading(){
    return trading;
}
public void setChargingfortrading(){
    this.chargingfortrading=chargingfortrading;

}
   public String toString(){
       return trading+ ""+ chargingfortrading;

    }
}

//warunki :
//1. jesli klient ma 500K to mozna mu trading  , jak ma mniej to nie
// 2. jesli klient jest 1 z 4 rodzajow klientow to oplaty wynosza odpowiednio:
//  this.retailClients = 1%
//this.professionalClients =2%;
//      this.authorisedPerson = w zaleznosci kogo reprezentuje;
//    this.professionalClientAndEligibleC = 0,5%;
// 3. jesli kazdy z  klientow spelnia  wszystkie warunki z rule engine to moze miec advising i byc chargowany
// jesli klient  retail ma 500 k to moze korzystac z asset management ,financial instrument, financial services products
//Investment banking , tradining oprocz  restricted countries.
// jesli klient nie jest z kraju restricted countries to moze moze miec trading.