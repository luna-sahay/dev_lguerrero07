package proyecto;

public class Edificio implements HuellaDeCarbono {
    private String nombre;
    private double consumoKwh;

    public Edificio(String nombre, double consumoKwh) {
        this.nombre = nombre;
        this.consumoKwh = consumoKwh;
    }

    @Override
    public double TraerHuellaDeCarbono() { return consumoKwh * 0.5; }

    @Override
    public String TraerInfo() { return "Edificio: " + nombre; }
}