/**
 * Created by Piotr on 2016-01-10.
 */
public class RuleEngine extends BankAccount {
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
String countryClosed;// closed for investment
String countryOpened;    // yes for investment
RuleEngine(String powerOfAttorney, String nationality,String domicile, String investmentThreshold, String assets,
           Boolean countryRestrictions,Boolean omnibusAccount, String segregatedAccount, String regulator,
           String legalForm, String countryClosed, String countryOpened ){

  this.powerOfAttorney=powerOfAttorney;
  this.nationality=nationality;
  this.domicile=domicile;
  this.investmentThreshold=investmentThreshold;
  this.assets=assets;
  this.countryRestrictions=countryRestrictions;
  this.segregatedAccount= segregatedAccount;
  this.legalForm= legalForm;
  this.omnibusAccount=omnibusAccount;

}
    public String toString(){
      return powerOfAttorney + nationality +domicile + investmentThreshold +assets +countryRestrictions+ omnibusAccount+
    segregatedAccount + legalForm;

    }
}

