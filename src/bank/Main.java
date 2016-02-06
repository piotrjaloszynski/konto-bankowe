package bank;

import bank.BankAccount;

/**
 * Created by Piotr on 2016-01-08.
 */
public class Main {


    public static void main(String[] args) {
       RuleEngine ruleEngine= new RuleEngine();
        ruleEngine.addQuestion("Do you have signed Power of Attorney?");
    ruleEngine.addQuestion("What nationality are you ?");
    ruleEngine.addQuestion("What  domicile/legal address  are you placed?");
        ruleEngine.addQuestion("What tax should you pay for your investments? ");
        ruleEngine.addQuestion("What is your account threshold? ");
        ruleEngine.addQuestion("What assets do you want to invest in ? ");
        ruleEngine.addQuestion("Do you want to invest into restricted countries ? ");
        ruleEngine.addQuestion("Should your regulator require you will need to open the omnibus account or close the account? ");
        ruleEngine.addQuestion("Do you want to have segregated account? ");
        ruleEngine.addQuestion(" Where are you domiciled in order to check the regulator`s requirements? ");
        ruleEngine.addQuestion("What is your legal form? ");
        ruleEngine.addQuestion("Should you want to invest into restricted countries you wont be allowed?");
        ruleEngine.addQuestion("Do you want to invest in opened countries in accordance to your account limits? ");
        ruleEngine.addQuestion("Shall KYC be checked for you we will inform you?");
        ruleEngine.addQuestion("Should you exceed certain treshhold you will be offered a support from the relationship manager?");
        ruleEngine.addQuestion("");

    }

}
