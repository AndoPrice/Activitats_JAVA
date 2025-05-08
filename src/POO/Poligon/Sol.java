package POO.Poligon;

import POO.Triangle.Punt2D;
import processing.core.PApplet;

import static processing.core.PApplet.radians;

public class Sol extends Poligon{
    float radiInterior;

    public Sol(Punt2D c, float radiExterior, float radiInterior) {
        super(33, c, radiExterior);
        updatePuntsInteriors(c);

        this.radiInterior = radiInterior;
    }

    public void setRadiInterior(float radiInterior) {
        this.radiInterior = radiInterior;
    }

    public void updatePuntsInteriors(Punt2D c){
        float angStep = 360f / punts.length;
        float ang = 0;
        for(int i = 0; i<punts.length; i++){
            if(i%3>0) {
                punts[i].x = c.getX() + radiInterior * PApplet.cos(radians(ang));
                punts[i].y = c.getY() + radiInterior * PApplet.sin(radians(ang));
            }
            ang +=angStep;
        }
    }
}
