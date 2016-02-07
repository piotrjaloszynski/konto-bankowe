package RuleEngine;

/**
 * Created by Gosia on 2016-02-07.
 */
public class KYC extends RuleEngine {
    private String KYC;

    public KYC(String relationshipManager, String KYC) {
        super(relationshipManager);
        this.KYC = KYC;
    }

    public String getKYC() {
        return KYC;
    }

    public void setKYC(String KYC) {
        this.KYC = KYC;
    }

    @Override
    public String toString() {
        return "KYC{" +
                "KYC='" + KYC + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return true;

           }

        KYC kyc = (KYC) o;

        return relationshipManager.equals(kyc.relationshipManager);
    }
    @Override
    public int hashCode() {
        return relationshipManager.hashCode();

    }}