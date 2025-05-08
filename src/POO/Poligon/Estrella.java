package POO.Poligon;

import POO.Triangle.Punt2D;
import processing.core.PApplet;

import static processing.core.PApplet.radians;

public class Estrella extends Poligon{

    float rI;

    Estrella(Punt2D c, float rE, float rI){
        super(12, c, rE);
        updatePI(c);
        this.rI = rI;
    }

    public void setrI(float r){
        this.rI = r;
    }

    public void updatePI(Punt2D c){
        float angStep = 360f / 12;
        float ang = 0;
        for(int i = 0; i<punts.length; i+=2){
            punts[i].x = c.getX()+ rI* PApplet.cos(radians(ang));
            punts[i].y = c.getY()+ rI*PApplet.sin(radians(ang));
            ang +=2*angStep;
        }
    }
}