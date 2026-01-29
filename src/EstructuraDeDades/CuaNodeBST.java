package EstructuraDeDades;

import processing.core.PApplet;

public class CuaNodeBST {
    NodeBST[] array;
    int last = -1;

    CuaNodeBST(){
        array = new NodeBST [10];
    }

    void encola(NodeBST n){
        last++;
        array[last] = n;
    }

    NodeBST desencola(){
        NodeBST temp = array[0];
        for(int i=0; i<last; i++){
            array[i] = array[i+1];
        }
        last--;
        return temp;
    }

    boolean isEmpty(){
        return last==-1;
    }

    boolean isFull(){
        return last==array.length-1;
    }

    int numElements(){
        return last+1;
    }

    void display(PApplet p5, int x, int y){
        float r = 70; p5.strokeWeight(3);
        for(int i=array.length-1; i>=0; i--){
            p5.fill(0); p5.textSize(24);
            p5.text(i, x + (array.length - i - 1)*r + r/2 , y - r/2);
            p5.fill(255);
            p5.rect(x + i*r, y , r,r);
        }

        for(int i=array.length-1; i>=0; i--){
            if(i<=last){
                p5.fill(255,0,0); p5.textSize(24); p5.textAlign(p5.CENTER);
                p5.text(array[i].toString(),  x + (array.length - i - 1)*r + r/2 , y + r/1.5f);
            }
        }

        p5.fill(0); p5.textSize(32);
        p5.text("^", x + (array.length - last -1)*r + r/2, y  + r*1.5f);
        p5.text("|", x + (array.length - last -1)*r + r/2, y  + r*1.75f);
        p5.text("Last("+last+")", x + (array.length - last -1)*r + r/2, y  + r*2.2f);
    }

}

