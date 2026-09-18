package Builder;

public class Funcion {
    public final String pelicula;
    public final String horario;
    public Funcion(String pelicula, String horario) {
        this.pelicula = pelicula;
        this.horario = horario;
    }
    @Override
    public String toString() {
        return "Función : " + pelicula + " (" + horario + ")";
    }
}
