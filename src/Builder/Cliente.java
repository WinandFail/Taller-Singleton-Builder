package Builder;

public class Cliente {
    private final String nombre;
    private final String email;
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Nombre : " + nombre + ", Correo Electrónico : " + email;
    }
}
