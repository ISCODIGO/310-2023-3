package box;

public class Main {
    public static void main(String[] args) {
        Caja caja1 = new Caja(10, 10, 20, "madera");
        Caja caja2 = new Caja(10, 10, 20, "madera");
        System.out.println(caja1.equals(caja2));

        caja1.agregarContenido(new Contenido("comida", 1000));
        caja1.agregarContenido(new Contenido("utensilios", 750));
        caja1.agregarContenido(new Contenido("material de limpieza", 750));
        System.out.println(caja1);

        caja1.pasarMaterial(caja2, "comida");
        System.out.println("Despues del traslado...");
        System.out.println(caja1);
        System.out.println(caja2);

        System.out.printf("El volumen es: %d u^3", caja1.calcularVolumen());

    }
}
