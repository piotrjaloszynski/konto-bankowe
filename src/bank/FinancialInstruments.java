package bank;

/**
 * Created by Gosia on 2016-01-17.
 */
public class FinancialInstruments {
    String moneyMarketInstruments;
String unitsInCollectiveInvestmentUndertakings;
String transferableSecurities;
String futuresAndOptions;
String derivativeInstrumentsForTransferOfCreditRisk;
String financialContractsForDifferences;

    FinancialInstruments(String  moneyMarketInstruments, String  unitsInCollectiveInvestmentUndertakings,
                         String  transferableSecurities,String  futuresAndOptions,String derivativeInstrumentsForTransferOfCreditRisk,
                         String  financialContractsForDifferences){

    this.moneyMarketInstruments=moneyMarketInstruments;
    this.unitsInCollectiveInvestmentUndertakings=unitsInCollectiveInvestmentUndertakings;
    this.transferableSecurities=transferableSecurities;
    this.futuresAndOptions=futuresAndOptions;
    this.derivativeInstrumentsForTransferOfCreditRisk=derivativeInstrumentsForTransferOfCreditRisk;
    this.financialContractsForDifferences= financialContractsForDifferences;
}
    public String toString(){
        return moneyMarketInstruments+ ""+ unitsInCollectiveInvestmentUndertakings+ ""+ transferableSecurities+""
                +""+futuresAndOptions+""+ derivativeInstrumentsForTransferOfCreditRisk+"" +financialContractsForDifferences;
    }
}
