package POO.Poligon;

import POO.Triangle.Punt2D;
import processing.core.PApplet;

public class MainEstrella extends PApplet{
    Estrella e;
    Punt2D ce;


    public static void main(String[] args) {
        PApplet.main("POO.Poligon.MainEstrella");
    }

    public void settings(){
        size(800,800);
    }

    public void setup(){
        ce = new Punt2D("O", 0, 0);
        e = new Estrella(ce, 200, 100);

    }
    public void draw(){
        background(255);
        fill(0);
        translate(width/2, height/2);
        line(0, height, 0, -height);
        line(-width, 0, width, 0 );
        e.display(this);

        float rI = map(mouseX, 0, width, 100, 250);
        e.setrI(rI);
        e.updatePI(ce);
    }
}