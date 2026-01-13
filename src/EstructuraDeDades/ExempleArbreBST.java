package EstructuraDeDades;

public class ExempleArbreBST {

    public static void main(String[] args) {
        NodeBST arrel = new NodeBST(23);
        NodeBST n11 = new NodeBST(11);
        NodeBST n44 = new NodeBST(44);
        NodeBST n5 = new NodeBST(5);
        NodeBST n28 = new NodeBST(28);

        arrel.setFillEsq(n11);
        arrel.setFilldret(n44);
        n11.setFillEsq(n5);
        n44.setFillEsq(n28);

        System.out.println("\nRecorregut inordre: ");
        inordre(arrel);

        System.out.println("\nRecorregut preordre: ");
        preordre(arrel);

        System.out.println("\nRecorregut postordre: ");
        postordre(arrel);
    }

    public static void inordre(NodeBST n){
        if(n!=null){
            inordre(n.esq);
            n.visitar();
            inordre(n.dret);
        }
    }

    public static void preordre(NodeBST n){
        if(n!=null){
            n.visitar();
            preordre(n.esq);
            preordre(n.dret);
        }
    }

    public static void postordre(NodeBST n){
        if(n!=null){
            postordre(n.esq);
            postordre(n.dret);
            n.visitar();
        }
    }

    public static void reverse(NodeBST n){
        if(n!=null){
            reverse(n.dret);
            n.visitar();
            reverse(n.esq);
        }
    }
}
