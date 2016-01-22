package bank;


/**
 * Created by Gosia on 2016-01-11.
 */
public class InvestmentBanking {
private String initialPublicOfferings;
private String debtfinancing;
private String corporatebonds;
private String financialStatement;
private String prospectus;
private String shares;



 InvestmentBanking(String initialPublicOfferings, String debtfinancing, String corporatebonds, String financialStatement,
         String prospectus,String shares) {
     this.initialPublicOfferings = initialPublicOfferings;
     this.debtfinancing = debtfinancing;
     this.corporatebonds = corporatebonds;
     this.financialStatement = financialStatement;
     this.prospectus = prospectus;
     this.shares = shares;
 }
    InvestmentBanking(){

    }

public String getInitialPublicOfferings(){
    return initialPublicOfferings;
}
public void setInitialPublicOfferings(String initialPublicOfferings){
    this.initialPublicOfferings=initialPublicOfferings;
}

    public String getDebtfinancing(){
        return debtfinancing;

    }
public void setDebtfinancing(String debtfinancing){
    this.debtfinancing=debtfinancing;

}
    public String getCorporatebonds(){
        return corporatebonds;
    }
    public void setCorporatebonds( String corporatebonds){
        this.corporatebonds=corporatebonds;
    }
    public String getFinancialStatement(){
        return financialStatement;
    }
    public void setFinancialStatement(String financialStatement){
        this.financialStatement=financialStatement;
    }
    public String getProspectus(){
        return prospectus;

    }
    public void setProspectus(){
        this.prospectus=prospectus;
    }
    public String getShares(){
        return shares;
    }
    public void setShares(String shares){
        this.shares=shares;
    }
    public String toString(){
    return initialPublicOfferings+ " "+ debtfinancing+ ""+ corporatebonds+" "+ financialStatement+""+ prospectus+ "" +
    shares;
    }
}

