package EstructuraDeDades;

import processing.core.PApplet;

public class MainArbreBST extends PApplet {

    ArbreBST arbreBST;
    int valorMaxim;
    int valorMinim;
    int valorCerca;
    boolean resultatCerca;

    public static void main(String[] args) {
        PApplet.main("EstructuraDeDades.MainArbreBST");
    }

    public void settings() {
        size(1400,800);
    }

    public void setup(){
        arbreBST = new ArbreBST();
        for (int t=0; t<10; t++){
            int nr = (int)random(0,100);
            arbreBST.addElement(nr);
        }
    }

    public void draw(){
        background(255);
        arbreBST.display(this, arbreBST.arrel, width/2, 100, 50, 0);
    }

    public void keyPressed(){
        if(key=='a'){
            arbreBST = new ArbreBST();
            for(int t = 0; t<10; t++){
                int nr = (int) random(0,100);
                arbreBST.addElement(nr);
            }
            valorMaxim = arbreBST.getMaxim();
            valorMinim = arbreBST.getMinim();
            arbreBST.bfs(arbreBST.arrel, -1);
        }
        else if(key=='c'){
            valorCerca = (int)random(0,100);
            resultatCerca=arbreBST.cercaElement(valorCerca, arbreBST.arrel);
        }
    }


}
