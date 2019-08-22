package se.arbetsformedlingen.matchning.portability.model.asp;

import java.util.Date;

public class Arbetsort {
    private long id;
    private long arbetssokandeprofilId;
    private String arbetsortTyp;
    private String varde1;
    private String varde2;
    private Date senastUppdaterad;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getArbetssokandeprofilId() {
        return arbetssokandeprofilId;
    }

    public void setArbetssokandeprofilId(long arbetssokandeprofilId) {
        this.arbetssokandeprofilId = arbetssokandeprofilId;
    }

    public String getArbetsortTyp() {
        return arbetsortTyp;
    }

    public void setArbetsortTyp(String arbetsortTyp) {
        this.arbetsortTyp = arbetsortTyp;
    }

    public String getVarde1() {
        return varde1;
    }

    public void setVarde1(String varde1) {
        this.varde1 = varde1;
    }

    public String getVarde2() {
        return varde2;
    }

    public void setVarde2(String varde2) {
        this.varde2 = varde2;
    }

    public Date getSenastUppdaterad() {
        return senastUppdaterad;
    }

    public void setSenastUppdaterad(Date senastUppdaterad) {
        this.senastUppdaterad = senastUppdaterad;
    }
}
