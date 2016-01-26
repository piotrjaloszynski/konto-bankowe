package bank;

/**
 * Created by Gosia on 2016-01-18.
 */
public class RestrictedCountries {

    private String iraq;
    private String iran;
    private String cuba;
    private String northKorea;

    private String libya;

    RestrictedCountries(String iraq, String iran, String cuba, String northKorea) {
        this.cuba = cuba;
        this.iran = iran;
        this.iraq = iraq;
        this.cuba = cuba;
        this.libya = libya;
        this.northKorea = northKorea;
    }

    public String getIraq() {
        return iraq;
    }

    public void setIraq(String iraq) {
        this.iraq = iraq;
    }

    public String getIran() {
        return iran;
    }

    public void setIran(String iran) {
        this.iran = iran;
    }

    public String getCuba() {
        return cuba;
    }

    public void setCuba(String cuba) {
        this.cuba = cuba;
    }

    public String getNorthKorea() {
        return northKorea;
    }

    public void setNorthKorea(String northKorea) {
        this.northKorea = northKorea;
    }

    public String getLibya() {
        return libya;
    }

    public void setLibya(String libya) {
        this.libya = libya;
    }

    public String toString(){

             return iraq+ ""+ iran+ ""+ cuba + ""+ northKorea+ ""+ ""+ libya;
      }

  }