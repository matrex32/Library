public class CarteInexistentaException extends Exception{
    public CarteInexistentaException(){
        super("Cartea nu exista in baza de date");
    }
}