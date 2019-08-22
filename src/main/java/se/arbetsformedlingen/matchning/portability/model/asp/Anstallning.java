package se.arbetsformedlingen.matchning.portability.model.asp;

import se.arbetsformedlingen.matchning.portability.model.asp.common.ArManad;
import se.arbetsformedlingen.matchning.portability.model.asp.common.Erfarenhet;

import java.util.Date;
import java.util.List;

public class Anstallning extends Erfarenhet {

    private String arbetsgivare;
    private List<Integer> yrkeserfarenhetIdLista;

    public String getArbetsgivare() {
        return arbetsgivare;
    }

    public void setArbetsgivare(String arbetsgivare) {
        this.arbetsgivare = arbetsgivare;
    }

    public List<Integer> getYrkeserfarenhetIdLista() {
        return yrkeserfarenhetIdLista;
    }

    public void setYrkeserfarenhetIdLista(List<Integer> yrkeserfarenhetIdLista) {
        this.yrkeserfarenhetIdLista = yrkeserfarenhetIdLista;
    }
}
