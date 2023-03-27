public class Poezii extends Carte{
    int nrPoezii;
    
    public Poezii(String titlu, String autor, int nrPag, int nrPoezii ){
        this.titlu = titlu;
        this.nrPoezii = nrPoezii;
        this.nrPag = nrPag;
        this.autor = autor;
    }
    
    @Override
    public String toString(){
        return "Poezia " + titlu + "scrisa de" + autor  + " si are " + nrPag + " pagini" + " cu " + nrPoezii + "poezii" ;
    }
}