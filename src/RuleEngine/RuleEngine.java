package RuleEngine;

/**
 * Created by Gosia on 2016-02-07.
 */
public class RuleEngine {
protected String relationshipManager;

    public RuleEngine(String relationshipManager) {
        this.relationshipManager = relationshipManager;

    }

    public String getRelationshipManager() {
        return relationshipManager;
    }

    public void setRelationshipManager(String relationshipManager) {
        this.relationshipManager = relationshipManager;
    }


}