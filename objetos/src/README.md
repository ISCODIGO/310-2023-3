# Programacion Orientada a Objetos

## Estructura basica
- Clase -> plantilla / molde (estructura)
- Objeto -> producto del molde
  - atributos -> datos
    - Estado: es el ultimo valor de un atributo. 
  - metodos -> funciones
    - Constructores: se llama cuando un objeto es creado.
      - public
      - no tienen retorno, ni siquiera void.
      - se llaman igual que la clase.
    - Destructores: se llama cuando un objeto es destruido.
    - Accesores/Getter/Lectura: me permiten leer un atributo.
      - prefijo get.
      - no tiene argumentos.
      - devuelve el mismo tipo del atributo.
    - Mutadores/Setter/Escritura: me permiten modificar el valor de un atributo.
      - prefijo set.
      - tienen al menos un argumento.
      - devuelve void.
### this
Una referencia al objeto actual.
 
## Pilares
- Abstraccion: nivel de detalle de nuestras estructuras con respecto al modelo original, de acuerdo al objetivo.
- Encapsulamiento: que datos se muestra y a que nivel de un objeto. En Java, por lo general, se ocultan los datos (privados).
  - private: objeto.
  - protected: objeto | package | heredados
  - public: objeto | package | heredados | fuera del package
  - default | package: objeto | package
- Herencia: reutilizacion de codigo mediante el uso de estructuras base para crear otras estructuras.
  - super: acceder a los elementos (atributos o metodos) que existen en la clase base.
- Polimorfismo


    // Clase objeto = new Clase()
    // Casos especiales
    String str = "hola";  // string - alternativa
    int[] arr = {1, 2, 3};  // array - alternativa
    Integer entero = 10;  // wrapper - requerida
    System.out.println(caja1);

## Funciones heredadas
Todas las clases en Java proceden clase original: Object.