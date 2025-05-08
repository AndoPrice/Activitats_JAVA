package POO;

public class Cotxe {

    //atributs
    String marca;
    String matricula;
    float velocitat;
    int portes;

    //Mètodes

    //constructor
    Cotxe(String mca, String mtca, float v, int p){
        marca = mca;
        matricula = mtca;
        velocitat = v;
        portes = p;
    }

    Cotxe(String mca, String mtca){
        marca = mca;
        matricula = mtca;
        velocitat = 0f;
        portes = 4;
    }

    // Setter
    void setMarca (String mca){
        marca = mca;
    }
    void setMatricula (String mtca){
        matricula = mtca;
    }
    void setVelocitat (float v){
        velocitat = v;
    }
    void setPortes (int p){
        portes = p;
    }

    // Getters

    String getMarca(){
        return marca;
    }
    String getMatricula(){
        return matricula;
    }
    float getVelocitat(){
        return velocitat;
    }
    int getPortes(){
        return portes;
    }

    // Altres
    void print(){
        System.out.printf("%s, %s, %f, %d\n", marca, matricula, velocitat, portes);
    }

    void accelerar(float q){
        velocitat+=q;
    }
}
