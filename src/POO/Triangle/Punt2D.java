package POO.Triangle;

import processing.core.PApplet;

public class Punt2D {

    // Atributs, propietats o variables de classe
    public float x, y;
    String nom;

    // Constructor(s)
    public Punt2D(){
        this.x = 0;
        this.y = 0;
        this.nom = "O";
    }

    public Punt2D(String nom, float x, float y){
        this.nom = nom;
        this.x = x;
        this.y = y;
    }



    // Setters (Mutadores)

    public void setX(float x){ this.x = x; }
    public void setY(float y){ this.y = y; }
    void setNom(String nom){ this.nom = nom; }
    void setXY(float x, float y){ this.x = x; this.y = y;}

    // Getters (Accesores)
    String getNom(){ return this.nom;}
    public float getX(){ return this.x;}
    public float getY(){ return this.y;}

    // Altres
    public void display(PApplet p5){

        p5.fill(0);
        p5.circle(this.x, this.y, 20);
        p5.text(nom, x+30, y);

    }





}
