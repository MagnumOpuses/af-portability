package se.arbetsformedlingen.matchning.portability.model.asp;

import java.util.Date;

public class Sprak {
    private long id;
    private long arbetssokandeprofilId;
    private long grundkriterieId;
    private int namn;
    private int niva;
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

    public long getGrundkriterieId() {
        return grundkriterieId;
    }

    public void setGrundkriterieId(long grundkriterieId) {
        this.grundkriterieId = grundkriterieId;
    }

    public int getNamn() {
        return namn;
    }

    public void setNamn(int namn) {
        this.namn = namn;
    }

    public int getNiva() {
        return niva;
    }

    public void setNiva(int niva) {
        this.niva = niva;
    }

    public Date getSenastUppdaterad() {
        return senastUppdaterad;
    }

    public void setSenastUppdaterad(Date senastUppdaterad) {
        this.senastUppdaterad = senastUppdaterad;
    }
}
