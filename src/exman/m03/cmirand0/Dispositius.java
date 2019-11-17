package exman.m03.cmirand0;

public abstract class Dispositius {
    private String marca, model;
    private double preu_base;
    private double preu_final;

    public double getPreu_final() {
        return preu_final;
    }

    public void setPreu_final(double preu_final) {
        this.preu_final = preu_final;
    }

    public Dispositius(double preu_base) {
        this.preu_base = preu_base;
        this.preu_final = preu_base * 2;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPreu_base() {
        return preu_base;
    }

    public void setPreu_base(double preu_base) {
        this.preu_base = preu_base;
    }

    @Override
    public String toString() {
        return "Dispositius{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", preu_base=" + preu_base +
                '}';
    }
}
