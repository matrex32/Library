import java.util.*;
import java.util.ArrayList;

public class Biblioteca{
    private ArrayList<Carte> lista = new ArrayList<Carte>();
    private static Biblioteca instance;
    private Biblioteca(){

    }

    public synchronized static Biblioteca getInstance(){
        if(instance == null){
            instance = new Biblioteca();
        }
        return instance;
    }

    public void addCarte(Carte carte){
        lista.add(carte);
    }

    public void afiseazaCarti(){
        lista.forEach(e -> System.out.println(e));
    }

    public void afiseazaPoezii(){
        for(Carte c : lista){
            if(c instanceof Poezii){
                System.out.println(c);
            }
        }
    }

    public void afiseazaRomane(){
        for(Carte c : lista){
            if(c instanceof Romane){
                System.out.println(c);
            }
        }

    }

    public void afiseazaAutor(String titlu){
        for(Carte c : lista){
            if(c.titlu.equals(titlu)){
                System.out.println("Titlul cartii este" + titlu);
            }else{
                try{
                    throw new CarteInexistentaException();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void afiseazaCartiSortat(){
        if(lista.size() > 0){
            Collections.sort(lista, new Comparator<Carte>(){
                @Override
                public int compare(final Carte object1, final Carte object2){
                return object1.titlu.compareTo(object2.titlu);
            }
        });
        
        System.out.println("Lista sortata: ");
        
    } else
      System.out.println("Lista nu este sortata ");
}
}

