package Account;

import java.util.Arrays;

/**
 * Created by Gosia on 2016-02-07.
 */
    public class ShopProduct{
    private Account[] accounts;
    public ShopProduct() {
    accounts=new Account[10];

        }



    public void addAccount(Account account){
        for(int i=0; account.length; i++ ){// problem mozliwy z LENGTH poniewaz mamy "dziedzicznie"

         if (accounts[i] == null ){
         accounts[i] = account;
         break;
    }
}
}          @Override
            public String toString() {// przekonwertowac  obiekt na napis string,  zwraca string represention object
                String result = "";

                for (Account account:accounts){
                    if (accounts!= null) {
                        result += accounts + "\n";
                    }

                }


                return result;
            }}








