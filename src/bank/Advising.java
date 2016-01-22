package bank;

/**
 * Created by Gosia on 2016-01-21.
 */
public class Advising {
private String advising;
private String chargingForAdvising;
Advising(String advising, String chargingForAdvising){
    this.advising=advising;
this.chargingForAdvising=chargingForAdvising;
}
    public String getAdvising(){
        return advising;
    }
    public void setAdvising(String advising){
        this.advising=advising;
    }
    public String getChargingForAdvising(){
        return chargingForAdvising;
    }
    public void setChargingForAdvising(){
        this.chargingForAdvising=chargingForAdvising;
    }
public String toString(){
    return advising+"" + chargingForAdvising;
}
}
//
// warunki :
//1. jesli klient ma 500% to mozna mu advising jak ma mniej to nie ,
// jesli klient jest 1 z 4 rodzajow klientow to oplaty wynosza odpowiednio:
//  this.retailClients = 1%
//this.professionalClients =2%;
//      this.authorisedPerson = w zaleznosci kogo reprezentuje;
//    this.professionalClientAndEligibleC = 0,5%;
// warunki jesli kazdy z klientow spelnia wszystkie warunki z rule engine to moze miec advising i byc chargowany
// jesli klient  retail ma 500 k to moze korzystac z asset management ,financial instrument, financial services products
//Investment banking , tradining oprocz  restricted countries.
// Jesli klient nie jest z restricted countries to moze advising miec.
//