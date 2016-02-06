package Account;

/**
 * Created by Gosia on 2016-01-27.
 */
public class FXAccount extends Account {
private double FX;



FXAccount(String ownerName, String ownerSurname, double FX){
    super(ownerName,ownerSurname);
    this.FX=FX;
}




    public double getFX() {
        return FX;
    }

    public void setFX(double FX) {
        this.FX = FX;
    }

    public void fxaccount(){

}

    @Override
    public String toString() {
        return "FXAccount{" +
                "FX=" + FX +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;
            if (o == null || getClass() != o.getClass()) {
                 return false;
                }


                FXAccount fxAccount = (FXAccount) o;

                   return name.equals(FXAccount.name);
    }

   // @Override
   // public int hashCode() {
     //   return getFX() != null ? getFX().hashCode() : 0;

        @Override
           public int hashCode(){
               return name.hashCode();
            }



}
