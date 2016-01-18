package bank;

/**
 * Created by Gosia on 2016-01-17.
 */
public class AssetManagement {
public double equities;
public double fixedIncome;
public double indexSolutions;
public double multiAssetClassSolutions;
public String realEstate;
public double privateEquities;
public String hedgeFunds;
public double commodities;

AssetManagement(double equities,double fixedIncome, double indexSolutions,double multiAssetClassSolutions, String realEstate,
                double privateEquities, String hedgeFunds)  {
    this.equities=equities;
    this.fixedIncome=fixedIncome;
    this.indexSolutions=indexSolutions;
    this.multiAssetClassSolutions=multiAssetClassSolutions;
    this.realEstate=realEstate;
    this.privateEquities=privateEquities;
    this.hedgeFunds=hedgeFunds;
}
    AssetManagement(){

    }
public String toString()
{
return equities+" "+ fixedIncome+ "" +  indexSolutions+ " "+  multiAssetClassSolutions +""+ realEstate + ""+
     privateEquities + ""+ hedgeFunds;

}

}
