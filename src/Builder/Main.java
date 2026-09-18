package Builder;

public class Main {
    public static void main(String[] args) {
        Cliente cliente =  new Cliente("Alejandro Campo", "alejo@gmail.com");
        Funcion funcion = new Funcion("Bambi","20:00");
        Combo combo = new Combo("Palomitas pequeñas + perro + gaseosa ", 40000);
        Compra compraMinima = new Compra.Builder()
                .conCliente(cliente)
                .conFuncion(funcion)
                .conAsiento("A1")
                .build();
        System.out.println(compraMinima);

        Compra compraCompleta = new Compra.Builder()
                .conCliente(cliente)
                .conFuncion(funcion)
                .conAsiento("A15")
                .conAsiento("A14")
                .conCombo(combo)
                .conPuntos(50)
                .build();
        System.out.println(compraCompleta);

        try {
            new Compra.Builder()
                    .conFuncion(funcion)
                    .conAsiento("C1")
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
