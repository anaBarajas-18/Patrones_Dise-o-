package repaso;

import processing.core.PApplet;
import models.Borde;

public class Repaso extends PApplet {

    private Borde borde;

    public static void main(String[] args) {
        PApplet.main(Repaso.class);
    }

    @Override
    public void settings() {
        size(Config.ANCHO, Config.ALTO);
    }

    @Override
    public void setup() {
        background(Config.COLOR_FONDO);
        borde = new Borde(6, 0);
    }

    @Override
    public void draw() {
        stroke(borde.getColor());
        strokeWeight(borde.getAncho());
        fill(150);
        rect(100, 100, 200, 200);
    }
}
