package EstructuraDeDades;

public class LlistaNodes {

    Node head, tail;
    int numNodes;

    public LlistaNodes(){
        this.head = null;
        this.tail = null;
        numNodes = 0;
    }

    public boolean isEmpty(){
        return this.head == null && this.tail == null;

    }

    public void prepend(int v){
        if(isEmpty()){
            Node n = new Node(v);
            head = n;
            tail = n;
        }
        else{
            Node n = new Node(v,head);
            head = n;
        }
        numNodes++;

    }

    public void append(int v){
        if(isEmpty()){
            Node n = new Node(v);
            head = n;
            tail = n;
        }
        else{
            Node n = new Node(v);
            tail.seg = n;
            tail = n;
        }
    }

    public int numElements(){
        int n = 0;
        Node x = head;
        while(x!=null){
            x= x.seg;
            n++;
        }
        return n;

    }

    public void insertAt(int i, int v){
        if(i==0){
            prepend(v);
        }
        else if(i==numNodes-1){
            append(v);
        }
        else if (i<numNodes){
            int k=0;
            Node nAnt= head;
            while(k<i-1){
                nAnt = nAnt.seg;
                k++;
            }
            Node nSeg=nAnt.seg;
            Node nouNode = new Node(v,nSeg);
            nAnt.seg=nouNode;
            numNodes++;

        }
    }


}
