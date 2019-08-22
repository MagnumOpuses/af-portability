package se.arbetsformedlingen.matchning.portability.model.asp;

import java.util.Date;

public class Yrkesroll {
    private long id;
    private long arbetssokandeprofilId;
    private String kod;
    private String kodtyp;
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

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getKodtyp() {
        return kodtyp;
    }

    public void setKodtyp(String kodtyp) {
        this.kodtyp = kodtyp;
    }

    public Date getSenastUppdaterad() {
        return senastUppdaterad;
    }

    public void setSenastUppdaterad(Date senastUppdaterad) {
        this.senastUppdaterad = senastUppdaterad;
    }
}
