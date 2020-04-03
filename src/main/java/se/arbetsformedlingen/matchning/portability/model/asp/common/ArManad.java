package se.arbetsformedlingen.matchning.portability.model.asp.common;

public class ArManad {
    private int artal;
    private int manad;

    public int getArtal() {
        return artal;
    }

    public void setArtal(int artal) {
        assert (artal > 1900 && artal < 2100);
        this.artal = artal;
    }

    public int getManad() {
        return manad;
    }

    public void setManad(int manad) {
        assert (manad > 0 && manad < 13);
        this.manad = manad;
    }
}
