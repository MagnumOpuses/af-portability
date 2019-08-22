package se.arbetsformedlingen.matchning.portability.model.asp;

import java.util.Date;
import java.util.List;

public class Yrkeserfarenhet {
    private long id;
    private long arbetssokandeprofilId;
    private long yrkeserfarenhetGpId;
    private int yrkesbenamning;
    private int erfarenhet;
    private List<Integer> anstallningsIdLista;
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

    public int getErfarenhet() {
        return erfarenhet;
    }

    public void setErfarenhet(int erfarenhet) {
        this.erfarenhet = erfarenhet;
    }

    public long getYrkeserfarenhetGpId() {
        return yrkeserfarenhetGpId;
    }

    public void setYrkeserfarenhetGpId(long yrkeserfarenhetGpId) {
        this.yrkeserfarenhetGpId = yrkeserfarenhetGpId;
    }

    public int getYrkesbenamning() {
        return yrkesbenamning;
    }

    public void setYrkesbenamning(int yrkesbenamning) {
        this.yrkesbenamning = yrkesbenamning;
    }

    public List<Integer> getAnstallningsIdLista() {
        return anstallningsIdLista;
    }

    public void setAnstallningsIdLista(List<Integer> anstallningsIdLista) {
        this.anstallningsIdLista = anstallningsIdLista;
    }

    public Date getSenastUppdaterad() {
        return senastUppdaterad;
    }

    public void setSenastUppdaterad(Date senastUppdaterad) {
        this.senastUppdaterad = senastUppdaterad;
    }
}
