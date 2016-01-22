package bank;

/**
 * Created by Gosia on 2016-01-18.
 */
public enum RestrictedCountries {
    IRAQ, IRAN, CUBA, NORTH_KOREA, RUSSIA, LIBYA;
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






      public String toString(){

             return IRAQ+ ""+ IRAN+ ""+ CUBA+ ""+ NORTH_KOREA+ ""+ RUSSIA + ""+ LIBYA;
      }

  }