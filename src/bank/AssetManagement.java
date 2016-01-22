package bank;

/**
 * Created by Gosia on 2016-01-17.
 */
public class AssetManagement {

private String fixedIncome;
private  String indexSolutions;
private String multiAssetClassSolutions;
private String realEstate;
private  String privateEquities;
private String hedgeFunds;
private String commodities;
private String equities;

AssetManagement(String equities,String fixedIncome, String indexSolutions,String multiAssetClassSolutions, String realEstate,
                String privateEquities, String hedgeFunds, String commodities)  {
    this.fixedIncome=fixedIncome;
    this.indexSolutions=indexSolutions;
    this.multiAssetClassSolutions=multiAssetClassSolutions;
    this.realEstate=realEstate;
    this.privateEquities=privateEquities;
    this.hedgeFunds=hedgeFunds;
    this.commodities=commodities;
    this.equities=equities;
}



    AssetManagement(){}
    public String getEquities(){
     return equities;

    }

    public void setEquities(String equities){
        this.equities=equities;
    }

public String fixedIncome(){
    return fixedIncome;
}
public void setFixedIncome(String fixedIncome){
    this.fixedIncome=fixedIncome;
}
    public String getIndexSolutions(){
        return indexSolutions;
    }
public void setIndexSolutions(String indexSolutions){
    this.indexSolutions=indexSolutions;
}
public String getMultiAssetClassSolutions(){
    return multiAssetClassSolutions;
}
public void setMultiAssetClassSolutions(){
   this.multiAssetClassSolutions=multiAssetClassSolutions;
}
    public String getRealEstate()
    {
        return realEstate;

    }
    public void setRealEstate(String realEstate)
    {
        this.realEstate=realEstate;
    }
public String getPrivateEquities()
{
    return privateEquities;
}
public void setPrivateEquities(String privateEquities)
{
    this.privateEquities=privateEquities;
    }
public String getHedgeFunds(){
    return hedgeFunds;
    }
    public void setHedgeFunds(String hedgeFunds){
        this.hedgeFunds=hedgeFunds;
    }
    public String getCommodities(){
     return commodities;
    }
public void setCommodities( String commodities){
    this.commodities=commodities;
}
    public String toString(){
return equities+" "+ fixedIncome+ "" +  indexSolutions+ " "+  multiAssetClassSolutions +""+ realEstate + ""+
     privateEquities + ""+ hedgeFunds +""+ commodities;

}

}
