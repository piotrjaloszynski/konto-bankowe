package bank;

import java.util.List;
//import bank.Main;  // poprawnie zainplementowana klasa
/**
 * Created by Piotr on 2016-01-10.
 */
public class RuleEngine {
    private Boolean powerOfAttorney;
    private String nationality;
    private String  domicile;
    private double VAT = 23.0;//various countries various VAT
    private String investmentThreshold;
    private String assets;// if stock closed for business no sale or buy
    private Boolean countryRestrictions;
    private Boolean omnibusAccount;
    private Boolean segregatedAccount;
    private String regulator;
    private String legalForm;
    private Boolean restrictedCountry;// closed for investment
    private Boolean countryOpened;// opened for investment
    private Boolean kyc;
    private Boolean relationshipManager;
    List<QuestionsToRuleEngine> questions; // obiekt rule engine ma skladowa do pytanie

    RuleEngine() {

    }

    // yes for investment
    RuleEngine(Boolean powerOfAttorney, String nationality, String domicile, String investmentThreshold, String assets,
               Boolean countryRestrictions, Boolean omnibusAccount,Boolean segregatedAccount, String regulator,
               String legalForm, Boolean restrictedCountry, Boolean countryOpened, Boolean kyc, Boolean relationshipManager) {


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
        this.relationshipManager=relationshipManager;
    }
    public void addQuestion(String questionText) {
        questions.add(new QuestionsToRuleEngine(questionText));
        // teraz dopiero mozna dodawac pytania.
    }
        public Boolean getPowerOfAttorney() {
            return powerOfAttorney;
        }public void setPowerOfAttorney(Boolean powerOfAttorney) {
            this.powerOfAttorney = powerOfAttorney;
        }public String getNationality() {
            return nationality;
        }public void setNationality(String nationality) {
            this.nationality = nationality;
        }public String getDomicile() {
            return domicile;
        }public void setDomicile(String domicile) {
            this.domicile = domicile;
        }public double getVAT() {
            return VAT;
        }public void setVAT(double VAT) {
            this.VAT = VAT;
        }public String getInvestmentThreshold() {
            return investmentThreshold;
        }public void setInvestmentThreshold(String investmentThreshold) {
            this.investmentThreshold = investmentThreshold;
        }public String getAssets() {
            return assets;
        }public void setAssets(String assets) {
            this.assets = assets;
        }public Boolean getCountryRestrictions() {
            return countryRestrictions;
        }public void setCountryRestrictions(Boolean countryRestrictions) {
            this.countryRestrictions = countryRestrictions;
        }public Boolean getOmnibusAccount() {
            return omnibusAccount;
        }public void setOmnibusAccount(Boolean omnibusAccount) {
            this.omnibusAccount = omnibusAccount;
        }public Boolean getSegregatedAccount() {
            return segregatedAccount;
        }public void setSegregatedAccount(Boolean segregatedAccount) {
            this.segregatedAccount = segregatedAccount;
        }public String getRegulator() {
            return regulator;
        }public void setRegulator(String regulator) {
            this.regulator = regulator;
        }public String getLegalForm() {
            return legalForm;
        }public void setLegalForm(String legalForm) {
            this.legalForm = legalForm;
        }public Boolean getRestrictedCountry() {
            return restrictedCountry;
        }public void setRestrictedCountry(Boolean restrictedCountry) {
            this.restrictedCountry = restrictedCountry;
        }public Boolean getCountryOpened() {
            return countryOpened;
        }public void setCountryOpened(Boolean countryOpened) {
            this.countryOpened = countryOpened;
        }public Boolean getKyc() {
            return kyc;
        }

    public Boolean getRelationshipManager() {
        return relationshipManager;
    }

    public void setRelationshipManager(Boolean relationshipManager) {
        this.relationshipManager = relationshipManager;
    }

    public void setKyc(Boolean kyc) {
            this.kyc = kyc;

        }

    public String toString() {
        return powerOfAttorney + "" + nationality + "" + domicile + "" + investmentThreshold + "" + assets + "" + countryRestrictions + "" + omnibusAccount +
                segregatedAccount + "" + legalForm + "" + kyc+ ""+ relationshipManager;
//return Ulica + " " + Numer + " " + Miasto;
    }
}

// zawsze sprawsza jak ktos otwiera konto
//zawsze sprawsza jak  wykorzystywana jest ktorakolwiek klasa z package bank
