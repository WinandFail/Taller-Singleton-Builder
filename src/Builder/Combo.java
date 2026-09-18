package Builder;

public class Combo {
    private final String descripcion;
    private final double precio;
    public Combo(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Combo : " + descripcion + "precio : " + precio;
    }
}
