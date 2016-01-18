package bank;

/**
 * Created by Gosia on 2016-01-11.
 */
public class InvestmentBanking {
    String retailClientOnly;// as per MIFID
    String professionalClientOnly;//as per MIFID
    String retailAndProfessionalClientOnly;// as per MIFID
    String professionalClientandEligibleCounterparty;// as per MIFID

InvestmentBanking(String retailClientOnly,String professionalClientOnly,String retailAndProfessionalClientOnly,
                 String professionalClientandEligibleCounterparty){

   this.retailClientOnly=retailClientOnly;
    this.professionalClientOnly=professionalClientOnly;
    this.retailAndProfessionalClientOnly=retailAndProfessionalClientOnly;
    this.professionalClientandEligibleCounterparty=professionalClientandEligibleCounterparty;
}

    public String toString(){
    return retailClientOnly+""+  professionalClientOnly+""+ retailAndProfessionalClientOnly+""+   professionalClientandEligibleCounterparty;
    }
}

