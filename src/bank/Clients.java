package bank;

/**
 * Created by Gosia on 2016-01-20.
 */
public class Clients {
    String retailClients;
    String professionalClients;
    String authorisedPerson;
    String professionalClientandEligibleCounterparty;
    Clients(){

    }
    Clients(String retailClients, String professionalClients, String authorisedPerson,
            String eligibleCounterparty) {

        this.retailClients = retailClients;
        this.professionalClients = professionalClients;
        this.authorisedPerson = authorisedPerson;
        this.professionalClientandEligibleCounterparty = professionalClientandEligibleCounterparty;

    }
    public String toString(){

        return retailClients+" "+ professionalClients+ " "+authorisedPerson+ " "+ professionalClientandEligibleCounterparty;
    }

}
