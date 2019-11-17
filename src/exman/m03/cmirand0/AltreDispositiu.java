package exman.m03.cmirand0;

public class AltreDispositiu extends Dispositius {
    private String descripcio;

    public AltreDispositiu(double preu_base,String descripcio) {
        super(preu_base);
        this.descripcio=descripcio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    @Override
    public String toString() {
        return "AltreDispositiu{marca= " +getMarca()+" model= "+getModel()+" preu base= "+getPreu_base()+
                " descripcio='" + descripcio + '\'' +
                '}';
    }
}
