package Builder;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private final Cliente cliente;
    private final Funcion funcion;
    private final List<String> asientos;
    private final Combo combo; // Opcional
    private final int puntosRedimidos; // Opcional

    // Constructor privado que recibe el Builder
    private Compra(Builder b) {
        this.cliente = b.cliente;
        this.funcion = b.funcion;
        this.asientos = b.asientos;
        this.combo = b.combo;
        this.puntosRedimidos = b.puntosRedimidos;
    }

    // Clase interna estática Builder
    public static class Builder {
        // Mismos campos, SIN final, con valores por defecto
        private Cliente cliente;
        private Funcion funcion;
        private List<String> asientos = new ArrayList<>();
        private Combo combo = null; // Opcional
        private int puntosRedimidos = 0; // Opcional

        // Métodos fluidos (retornan this)
        public Builder conCliente(Cliente c) {
            this.cliente = c;
            return this;
        }

        public Builder conFuncion(Funcion f) {
            this.funcion = f;
            return this;
        }

        public Builder conAsiento(String asiento) {
            this.asientos.add(asiento);
            return this;
        }

        public Builder conCombo(Combo c) {
            this.combo = c;
            return this;
        }

        public Builder conPuntos(int puntos) {
            this.puntosRedimidos = puntos;
            return this;
        }
        public Compra build() {
            // VALIDACIÓN 1: Cliente obligatorio
            if (cliente == null) {
                throw new IllegalArgumentException("El cliente es obligatorio para la compra.");
            }
            // VALIDACIÓN 2: Función obligatoria
            if (funcion == null) {
                throw new IllegalArgumentException("La función es obligatoria para la compra.");
            }
            // VALIDACIÓN 3 (Opcional pero recomendada): Asientos
            if (asientos.isEmpty()) {
                throw new IllegalArgumentException("Debe seleccionar al menos un asiento.");
            }
            return new Compra(this);
        }
    }
    @Override
    public String toString() {
        return "COMPRA:\n" +
                "  " + cliente + "\n" +
                "  " + funcion + "\n" +
                "  Asientos: " + asientos + "\n" +
                "  " + (combo != null ? combo : "Sin combo") + "\n" +
                "  Puntos redimidos: " + puntosRedimidos;
    }

}
