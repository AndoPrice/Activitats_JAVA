package POO.Cercle;

import POO.Triangle.Punt2D;
import processing.core.PApplet;

public class MainCercle extends PApplet {

    Cercle c1, c2;
    public static void main(String[] args) {
        PApplet.main("POO.Cercle.MainCercle");
    }

    public void settings(){
        size(800,800);
    }

    public void setup(){
        c1 = new Cercle();
        c2 = new Cercle(new Punt2D("C", 200, 200),300 );
    }

    public void draw(){
        background(255);
        translate(width/2, height/2);
        line(-width, 0, width, 0);
        line(0, -height, 0, height);

        c1.display(this);
        c2. display(this);

        float r = dist(c1.getCentre().getX(), c2.getCentre().getY(), mouseX - width/2, mouseY - height/2);
        c1.setRadi(r);
    }

    public void mousePressed(){

    }
}

