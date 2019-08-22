package se.arbetsformedlingen.matchning.portability.model.asp.common;

import java.util.Date;

public class Erfarenhet {
    private long id;
    private long arbetssokandeprofilId;
    private long grundmeritId;
    private String rubrik;
    private String beskrivning;
    private Date senastUppdaterad;
    private int sorteringsordning;
    private ArManad startdatum;
    private ArManad slutdatum;
    private boolean pagaende;

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

    public long getGrundmeritId() {
        return grundmeritId;
    }

    public void setGrundmeritId(long grundmeritId) {
        this.grundmeritId = grundmeritId;
    }

    public String getRubrik() {
        return rubrik;
    }

    public void setRubrik(String rubrik) {
        this.rubrik = rubrik;
    }

    public String getBeskrivning() {
        return beskrivning;
    }

    public void setBeskrivning(String beskrivning) {
        this.beskrivning = beskrivning;
    }

    public Date getSenastUppdaterad() {
        return senastUppdaterad;
    }

    public void setSenastUppdaterad(Date senastUppdaterad) {
        this.senastUppdaterad = senastUppdaterad;
    }

    public int getSorteringsordning() {
        return sorteringsordning;
    }

    public void setSorteringsordning(int sorteringsordning) {
        this.sorteringsordning = sorteringsordning;
    }

    public ArManad getStartdatum() {
        return startdatum;
    }

    public void setStartdatum(ArManad startdatum) {
        this.startdatum = startdatum;
    }

    public ArManad getSlutdatum() {
        return slutdatum;
    }

    public void setSlutdatum(ArManad slutdatum) {
        this.slutdatum = slutdatum;
    }

    public boolean isPagaende() {
        return pagaende;
    }

    public void setPagaende(boolean pagaende) {
        this.pagaende = pagaende;
    }
}
