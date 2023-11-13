package box;

public class Contenido {
    public String getMaterial() {
        return material;
    }

    public Contenido(String material, int volumen) {
        this.material = material;
        this.volumen = volumen;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    private String material;
    private int volumen;
}
