package bank;

/**
 * Created by Gosia on 2016-01-11.
 */
public class FinancialServicesProducts {
String mortgages;
String insurance;
String pensions;
String loans;
String credits;
    FinancialServicesProducts(){

    }
    FinancialServicesProducts( String mortgages, String insurance, String pensions,String loans, String credits ){
    this.mortgages=mortgages;
    this.insurance=insurance;
    this.pensions=pensions;
    this.loans=loans;
    this.credits=credits;
    }
}
