package box;

import java.util.Objects;
import java.util.ArrayList;

public class Caja {
    // atributos
   private int ancho;
   private int alto;
   private int profundidad;
   private String material;
   /*
   La relacion entre Caja y Contenido es por medio "composicion": Caja esta compuesta por Contenido
    */
   private ArrayList<Contenido> contenidos;

   public int getAncho() {
      return ancho;
   }

   public void setAncho(int ancho) {
      this.ancho = ancho;
   }

   public int getAlto() {
      return alto;
   }

   public void setAlto(int alto) {
      this.alto = alto;
   }

   public int getProfundidad() {
      return profundidad;
   }

   public void setProfundidad(int profundidad) {
      this.profundidad = profundidad;
   }

   public String getMaterial() {
      return material;
   }

   public void setMaterial(String material) {
      this.material = material;
   }

   public ArrayList<Contenido> getContenidos() {
      return contenidos;
   }

   private void setContenidos(ArrayList<Contenido> contenidos) {
      this.contenidos = contenidos;
   }

   public Caja(int ancho, int alto, int profundidad, String material) {
      this.ancho = ancho;
      this.alto = alto;
      this.profundidad = profundidad;
      this.material = material;
      this.contenidos = new ArrayList<>();
   }

   @Override
   public String toString() {
      /*

      %s -> String
      %d -> entero (int, short, long, char, byte)
      %f -> flotante (float, double)
      %.2f -> 3.456 -> 3.46
      %n -> salto linea

      */
      return String.format("La caja mide %dx%dx%d con un volumen de %d y esta hecha de %s. Tiene ocupado %d de volumen",
              this.alto, this.ancho, this.profundidad, this.calcularVolumen(), this.material, this.calcularVolumenUsado());
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;  // si los dos objetos son el mismo
      if (o == null || getClass() != o.getClass()) return false;  // es que los objetos sean de distinto tipo
      Caja caja = (Caja) o;  // convierte el Object en Caja
      return ancho == caja.ancho && alto == caja.alto
              && profundidad == caja.profundidad
              && Objects.equals(material, caja.material);
   }

   @Override
   public int hashCode() {
      return Objects.hash(ancho, alto, profundidad, material, contenidos);
   }

   // FUNCIONES ADICIONALES

   public int calcularVolumen() {
      return this.alto * this.ancho * this.profundidad;
   }

   public void agregarContenido(Contenido elemento) {
      this.contenidos.add(elemento);
   }

   public void eliminarContenido(Contenido elemento) {
      this.contenidos.remove(elemento);
   }

   public Contenido buscarContenido(String material) {
      for (Contenido item : this.contenidos) {
         if (item.getMaterial().equals(material)) {
            return item;
         }
      }
      return null;
   }

   public int calcularVolumenUsado() {
      int total = 0;
      for (Contenido item : contenidos) {
         total += item.getVolumen();
      }

      return total;
   }

   /*
   Esta funcion permite pasar el contenido de una caja a otra. Contemplando que las
   limitantes de volumen que tienen las cajas.

   caja1.pasar(caja2);

   -- (1) origen -> destino
   (2) caja2 -> caja1
    */
   public boolean pasarMaterial(Caja destino, String material) {
      Contenido contenido = this.buscarContenido(material);

      if (contenido == null) {
         return false;
      }

      int volumenDisponible = destino.calcularVolumen() - destino.calcularVolumenUsado();

      if (contenido.getVolumen() <= volumenDisponible) {
         this.eliminarContenido(contenido);
         destino.agregarContenido(contenido);
         return true;
      }

      return false;
   }

}
