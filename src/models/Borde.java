package models;

public class Borde {

    private int ancho;
    private int color;

    public Borde(int ancho, int color) {
        setAncho(ancho);
        this.color = color;
    }

    public Borde() {
        this(5, 0);
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho <= 10) {
            this.ancho = ancho;
        } else {
            this.ancho = 5;
            System.err.println("El ancho no debe ser mayor a 10");
        }
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}

