package POO.Poligon;

import POO.Triangle.Punt2D;
import processing.core.PApplet;

import static processing.core.PApplet.radians;

public class Quadrat extends Poligon{

    public Quadrat(Punt2D c, float s) {
        super(4);

        float r = (float)(s*Math.sqrt(2)/2f);
        float ang = 45;
        for(int i = 0; i<punts.length;i++){
            float x = c.getX()+ r* PApplet.cos(radians(ang));
            float y = c.getY()+ r*PApplet.sin(radians(ang));
            String t = String.valueOf(i+1);
            setPuntAt(i, new Punt2D(t, x, y));
            ang+= 90;
        }
    }
}
