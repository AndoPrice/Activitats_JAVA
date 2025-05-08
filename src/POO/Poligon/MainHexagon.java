package POO.Poligon;

import POO.Triangle.Punt2D;
import processing.core.PApplet;

public class MainHexagon extends PApplet {
    Hexagon h;


    public static void main(String[] args) {
        PApplet.main("POO.Poligon.MainHexagon");
    }

    public void settings(){
        size(800,800);
    }

    public void setup(){
        h = new Hexagon(new Punt2D("O", 0, 0), 200);

    }
    public void draw(){
        background(255);
        fill(0);
        translate(width/2, height/2);
        line(0, height, 0, -height);
        line(-width, 0, width, 0 );
        h.display(this);
    }
}
