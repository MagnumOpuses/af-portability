package se.arbetsformedlingen.matchning.portability.model.asp;

import java.util.Date;
import java.util.List;

public class Kompetens {
    private long id;
    private long arbetssokandeprofilId;
    private int taxonomiId;
    private List<Merit> ovrigaMeriter;
    private List<Utbildning> utbildningar;
    private List<Anstallning> anstallningar;
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

    public int getTaxonomiId() {
        return taxonomiId;
    }

    public void setTaxonomiId(int taxonomiId) {
        this.taxonomiId = taxonomiId;
    }

    public List<Merit> getOvrigaMeriter() {
        return ovrigaMeriter;
    }

    public void setOvrigaMeriter(List<Merit> ovrigaMeriter) {
        this.ovrigaMeriter = ovrigaMeriter;
    }

    public List<Utbildning> getUtbildningar() {
        return utbildningar;
    }

    public void setUtbildningar(List<Utbildning> utbildningar) {
        this.utbildningar = utbildningar;
    }

    public List<Anstallning> getAnstallningar() {
        return anstallningar;
    }

    public void setAnstallningar(List<Anstallning> anstallningar) {
        this.anstallningar = anstallningar;
    }

    public Date getSenastUppdaterad() {
        return senastUppdaterad;
    }

    public void setSenastUppdaterad(Date senastUppdaterad) {
        this.senastUppdaterad = senastUppdaterad;
    }
}
