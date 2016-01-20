package bank;
import BankAccount;

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
private RestrictedCountries restrictedCountries;
private RuleEngine ruleengine;

 InvestmentBanking(String initialPublicOfferings, String debtfinancing, String corporatebonds, String financialStatement,
         String prospectus,String shares){
     this.initialPublicOfferings=initialPublicOfferings;
     this.debtfinancing=debtfinancing;
     this.corporatebonds=corporatebonds;
     this.financialStatement=financialStatement;
     this.prospectus=prospectus;
     this.shares=shares;

//Trades();
//advises();
// corporate issues of new shares();


}

    public String toString(){
    return initialPublicOfferings+ " "+ debtfinancing+ ""+ corporatebonds+" "+ financialStatement+""+ prospectus+ "" +
    shares;
    }
}

