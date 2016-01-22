package bank;

/**
 * Created by Gosia on 2016-01-20.
 */
public class Clients {
    private String retailClients;
    private String uhnvi;
    private  String professionalClients;
    private String authorisedPerson;
    private String professionalClientAndEligibleC;




    Clients(String retailClients, String professionalClients, String authorisedPerson,
            String eligibleCounterparty, String uhnvi) {

        this.retailClients = retailClients;
        this.professionalClients = professionalClients;
        this.authorisedPerson = authorisedPerson;
        this.professionalClientAndEligibleC = professionalClientAndEligibleC;
        this.uhnvi=uhnvi;

    }
        Clients(){

        }
    public String getRetailClients(){
return retailClients;}
    public void setRetailClients(String retailClients) {
        this.retailClients = retailClients;
    }
        public String getProfessionalClients(){
            return professionalClients;
    }
    public void setProfessionalClients(String professionalClients){
        this.professionalClients=professionalClients;
    }
    public String getAuthorisedPerson(){
        return authorisedPerson;
    }
    public void setAuthorisedPerson(String authorisedPerson){
        this.authorisedPerson=authorisedPerson;
    }
    public String getProfessionalClientAndEligibleC(){
        return professionalClientAndEligibleC;
    }
    public void setProfessionalClientAndEligibleC(String professionalClientAndEligibleC){
        this.professionalClientAndEligibleC=professionalClientAndEligibleC;
    }
    public String getUhnvi(){
        return uhnvi;

    }
public void setUhnvi(){
    this.uhnvi=uhnvi;
}

    public String toString(){

        return retailClients+" "+ professionalClients+ " "+authorisedPerson+ " "+ professionalClientAndEligibleC+ ""+ uhnvi;
    }

}
