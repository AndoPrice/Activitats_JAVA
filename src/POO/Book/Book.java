package POO.Book;

public class Book {

    public enum Genere {NOVELA, POESIA, ECONOMIA};

    private String titol; //    quadrat==private??
    private String autor;
    private String isbn;
    private Genere genere;
    private int numPagines;

    public Book(String titol, String autor, String isbn){
        this.titol = titol;
        this.autor = autor;
        this.isbn = isbn;
        this.genere = Genere.NOVELA;
        this.numPagines = 0;
    }

    public Book(String titol, String autor, String isbn, Genere genere, int numPagines){
        this.titol = titol;
        this.autor = autor;
        this.isbn = isbn;
        this.genere = genere;
        this.numPagines = numPagines;
    }

    public void setTitol(String titol){
        this.titol = titol;
    }
    public String getTitol(){
        return titol;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public int getNumPagines() {
        return numPagines;
    }

    public void setNumPagines(int numPagines) {
        this.numPagines = numPagines;
    }

}
