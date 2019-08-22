package se.arbetsformedlingen.matchning.portability.model.asp;

import se.arbetsformedlingen.matchning.portability.model.asp.common.ArManad;
import se.arbetsformedlingen.matchning.portability.model.asp.common.Erfarenhet;

import java.util.Date;

public class Utbildning extends Erfarenhet {
    private String skola;
    private String niva;
    private String inriktning;

    public String getSkola() {
        return skola;
    }

    public void setSkola(String skola) {
        this.skola = skola;
    }

    public String getNiva() {
        return niva;
    }

    public void setNiva(String niva) {
        this.niva = niva;
    }

    public String getInriktning() {
        return inriktning;
    }

    public void setInriktning(String inriktning) {
        this.inriktning = inriktning;
    }
}
