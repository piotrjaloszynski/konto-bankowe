package bank;

import java.util.List;
//import bank.Main;  // poprawnie zainplementowana klasa
/**
 * Created by Piotr on 2016-01-10.
 */
public class RuleEngine {
    String powerOfAttorney;
    String nationality;
    String domicile;
    double VAT = 23.0;//various countries various VAT
    String investmentThreshold;
    String assets;// if stock closed for business no sale or buy
    Boolean countryRestrictions;
    Boolean omnibusAccount;
    String segregatedAccount;
    String regulator;
    String legalForm;
    String restrictedCountry;// closed for investment
    String countryOpened;// opened for investment
    String kyc;
    List<QuestionsToRuleEngine> questions; // obiekt rule engine ma skladowa do pytanie

    RuleEngine() {

    }

    // yes for investment
    RuleEngine(String powerOfAttorney, String nationality, String domicile, String investmentThreshold, String assets,
               Boolean countryRestrictions, Boolean omnibusAccount, String segregatedAccount, String regulator,
               String legalForm, String restrictedCountry, String countryOpened, String kyc) {

        this.powerOfAttorney = powerOfAttorney;
        this.nationality = nationality;
        this.domicile = domicile;
        this.investmentThreshold = investmentThreshold;
        this.assets = assets;
        this.countryRestrictions = countryRestrictions;
        this.segregatedAccount = segregatedAccount;
        this.legalForm = legalForm;
        this.omnibusAccount = omnibusAccount;
        this.restrictedCountry = restrictedCountry;
        this.kyc = kyc;
    }
    public void addQuestion(String questionText){
        questions.add(new QuestionsToRuleEngine(questionText));
        // teraz dopiero mozna dodawac pytania.



    }

    public String toString() {
        return powerOfAttorney + "" + nationality + "" + domicile + "" + investmentThreshold + "" + assets + "" + countryRestrictions + "" + omnibusAccount +
                segregatedAccount + "" + legalForm + "" + kyc;
//return Ulica + " " + Numer + " " + Miasto;
    }
}

// zawsze sprawsza jak ktos otwiera konto
//zawsze sprawsza jak  wykorzystywana jest ktorakolwiek klasa z package bank
