package POO.Poligon;

import POO.Triangle.Punt2D;
import processing.core.PApplet;

public class MainPoligon extends PApplet {
    Poligon t;

    public static void main(String[] args) {
        PApplet.main("POO.Poligon.MainPoligon");
    }

    public void settings(){
        size(800,800);
    }

    public void setup(){

        t = new Poligon(5, new Punt2D("0", 0, 0), 200);
        /*
        t = new Poligon(3);
        t.setPuntAt(0, new Punt2D("A", 0, -200));
        t.setPuntAt(1, new Punt2D("B", 200, 100));
        t.setPuntAt(2, new Punt2D("C", 100, 200));

        */

    }
    public void draw(){
        background(255);
        fill(0);
        translate(width/2, height/2);
        line(0, height, 0, -height);
        line(-width, 0, width, 0 );
        t.display(this);
    }
}
