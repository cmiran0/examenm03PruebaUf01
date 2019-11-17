package exman.m03.cmirand0;

public class Smartphon extends Dispositius implements Gama {
    private String sistema_operatiu;
    private boolean acelerometre, gps;
    public Smartphon(String sistema_operatiu, boolean acelerometre, boolean gps, double preu_base) {
        super(preu_base);
        this.sistema_operatiu = sistema_operatiu;
        this.acelerometre = acelerometre;
        this.gps = gps;
        if (acelerometre) setPreu_final(getPreu_final() + (getPreu_base() * 5 / 100));
        if (gps) setPreu_final(getPreu_final() + (getPreu_base() * 5 / 100));
    }

    public String getSistema_operatiu() {
        return sistema_operatiu;
    }

    public void setSistema_operatiu(String sistema_operatiu) {
        this.sistema_operatiu = sistema_operatiu;
    }

    public boolean isAcelerometre() {
        return acelerometre;
    }

    public void setAcelerometre(boolean acelerometre) {
        this.acelerometre = acelerometre;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Smartphon{ marca= " +getMarca()+" model= "+getModel()+" preu base= "+getPreu_base()+
                " sistema_operatiu='" + sistema_operatiu + '\'' +
                ", acelerometre=" + acelerometre +
                ", gps=" + gps +
                '}';
    }

    @Override
    public boolean isGama() {
        return (getPreu_final() > 850);
    }
}
