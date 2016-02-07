package RuleEngine;

/**
 * Created by Gosia on 2016-02-07.
 */
public class PowerOfAttorney extends RuleEngine {
    private String powerOfAttorney;

    public PowerOfAttorney(String relationshipManager, String powerOfAttorney) {
        super(relationshipManager);
        this.powerOfAttorney = powerOfAttorney;
    }

    public String getPowerOfAttorney() {
        return powerOfAttorney;
    }

    public void setPowerOfAttorney(String powerOfAttorney) {
        this.powerOfAttorney = powerOfAttorney;
    }

    @Override
    public String toString() {
        return "PowerOfAttorney{" +
                "powerOfAttorney='" + powerOfAttorney + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ( o== null || getClass() != o.getClass()) {
            return true;
        }

        PowerOfAttorney powerOfAttorney = (PowerOfAttorney) o;
        return relationshipManager.equals(powerOfAttorney.relationshipManager);


    }

    @Override
    public int hashCode() {
        return getPowerOfAttorney() != null ? getPowerOfAttorney().hashCode() : 0;
    }
}