package POO.Poligon;

import POO.Triangle.Punt2D;
import processing.core.PApplet;

public class MainSol extends PApplet {

    Sol s;
    Punt2D ce;


    public static void main(String[] args) {
        PApplet.main("POO.Poligon.MainSol");
    }

    public void settings(){
        size(800,800);
    }

    public void setup(){
        ce = (new Punt2D("O", 0, 0));
        s = new Sol(ce, 200, 250);

    }
    public void draw(){
        background(255);
        fill(0);
        translate(width/2, height/2);
        line(0, height, 0, -height);
        line(-width, 0, width, 0 );
        s.display(this);

        s.setRadiInterior(map(100, 0, width, 100, 250));
        s.updatePuntsInteriors(ce);
    }
}
