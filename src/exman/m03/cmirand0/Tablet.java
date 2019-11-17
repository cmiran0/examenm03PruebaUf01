package exman.m03.cmirand0;

public class Tablet extends Dispositius implements Gama{
    private double polsades;

    public Tablet(double preu_base) {
        super(preu_base);
    }

    public double getPolsades() {
        return polsades;
    }

    public void setPolsades(double polsades) {
        this.polsades = polsades;
    }

    @Override
    public String toString() {
        return "Tablet{marca= " +getMarca()+" model= "+getModel()+" preu base= "+getPreu_base()+
                " polsades=" + polsades +
                '}';
    }

    @Override
    public boolean isGama() {
        return (getPreu_final() > 850);
    }
}
