package be.fnord.util.logic.defaultLogic;


// Default rule consists of prerequisite, justification, consequence 

public class DefaultRule {


    private String prerequisite = a.e.EMPTY_FORMULA;
    private String justificatoin = a.e.EMPTY_FORMULA;
    private String consequence = a.e.EMPTY_FORMULA;


    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    public String getJustificatoin() {
        return justificatoin;
    }

    public void setJustificatoin(String justificatoin) {
        this.justificatoin = justificatoin;
    }

    public String getConsequence() {
        return consequence;
    }

    public void setConsequence(String consequence) {
        this.consequence = consequence;
    }

    public String toString() {
        String _results = "";
        String p = prerequisite;
        String j = justificatoin;
        String c = consequence;
        if (prerequisite.compareTo(a.e.EMPTY_FORMULA) == 0) p = "[]";
        if (justificatoin.compareTo(a.e.EMPTY_FORMULA) == 0) j = "[]";
        if (consequence.compareTo(a.e.EMPTY_FORMULA) == 0) c = "[]";
        _results = "[(" + p + "):(" + j + ") ==> (" + c + ")]";
        return _results;
    }


}
