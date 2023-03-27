public class Romane extends Carte{
    String tip;
    
    public Romane(String titlu, String autor, int nrPag, String tip){
        this.titlu = titlu;
        this.autor = autor;
        this.nrPag = nrPag;
        this.tip = tip;
    }
    
    @Override
    public String toString(){
        return "Romanul " + titlu  + " are " + nrPag +" pagini " + " si este" + tip;
    }
}